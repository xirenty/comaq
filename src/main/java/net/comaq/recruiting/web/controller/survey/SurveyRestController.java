package net.comaq.recruiting.web.controller.survey;

import net.comaq.recruiting.data.SurveyTemplate;
import net.comaq.recruiting.data.repository.SurveyTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/survey")
public class SurveyRestController {

    private static final String createSurveyUrl = "/create";
    private static final String allSurveysUrl = "/all";

    @Autowired
    private SurveyTemplateRepository repo;

    @RequestMapping(value = createSurveyUrl)
    public void createEmpySurvey() {
        repo.save(new SurveyTemplate("name"));
    }

    @PutMapping
    public boolean createSurvey(@RequestBody SurveyTemplate survey) {
        repo.save(survey);
        return true;
    }

    @GetMapping(value = "/{id}")
    public SurveyTemplate getById(@PathVariable(value = "id") Long id) {
        return repo.findById(id).orElse(null);
    }

    @RequestMapping(value = allSurveysUrl)
    public List<SurveyTemplate> all() {
        List<SurveyTemplate> result = new ArrayList<>();
        repo.findAll().forEach(result::add);
        return result;
    }
}
