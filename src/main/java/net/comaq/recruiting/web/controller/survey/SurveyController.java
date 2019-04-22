package net.comaq.recruiting.web.controller.survey;

import net.comaq.recruiting.data.SurveyTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    SurveyRestController surveyRestController;

    @GetMapping("/overview")
    public String test(Model model) {
        Collection<SurveyTemplate> templates = surveyRestController.all();
        model.addAttribute("surveys", templates);
        if (templates.iterator().hasNext()) {
            model.addAttribute("survey", templates.iterator().next());
        }
        return "datenuebersicht/datenuebersicht";
    }

}
