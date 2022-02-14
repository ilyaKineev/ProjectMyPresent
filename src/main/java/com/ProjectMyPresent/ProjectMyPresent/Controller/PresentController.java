package com.ProjectMyPresent.ProjectMyPresent.Controller;

import com.ProjectMyPresent.ProjectMyPresent.Service.MainService;
import com.ProjectMyPresent.ProjectMyPresent.Service.PresentService;
import com.ProjectMyPresent.ProjectMyPresent.model.json.JsonPresent;
import com.ProjectMyPresent.ProjectMyPresent.model.json.JsonQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/present")
public class PresentController {

    @Autowired
    MainService mainService;

    PresentService presentService = new PresentService();

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<JsonPresent> getAll() {
        return mainService.getAllPresent();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public JsonPresent getById(@PathVariable int id) {
        return mainService.getPresentById(id);
    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add() {
//        return presentService.addPresent();
//    }
//
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public String delete(@PathVariable int id) {
//        return presentService.deletePresentByID(id);
//    }

    @RequestMapping(value = "/getResultByTopQuestion", method = RequestMethod.POST)
    public List<JsonPresent> getResultByTopQuestion(@RequestBody List<JsonQuestion> jsonQuestions) {
        for (JsonQuestion jsonQuestion : jsonQuestions) {
            System.out.println(jsonQuestion.toString());
        }
        return presentService.getResultByTopQuestion(jsonQuestions);
    }
}
