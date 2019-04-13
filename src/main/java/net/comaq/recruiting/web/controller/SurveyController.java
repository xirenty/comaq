package net.comaq.recruiting.web.controller;

import net.comaq.recruiting.data.SurveyTemplate;
import net.comaq.recruiting.data.repository.SurveyTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SurveyController {

    public static final String createSurveyUrl = "/survey/create";
    public static final String allSurveysUrl = "/survey/all";


    @Autowired
    private SurveyTemplateRepository repo;

    @RequestMapping(value = createSurveyUrl)
    public void createEmpySurvey() {
        repo.save(new SurveyTemplate("name"));
    }

    @GetMapping(value = "/survey/{id}")
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
