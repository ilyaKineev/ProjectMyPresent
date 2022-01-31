package com.ProjectMyPresent.ProjectMyPresent.Controller;

import com.ProjectMyPresent.ProjectMyPresent.Service.PresentService;
import com.ProjectMyPresent.ProjectMyPresent.model.json.Present;
import com.ProjectMyPresent.ProjectMyPresent.model.json.Question;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@RestController
@RequestMapping("/present")
public class PresentController {

    PresentService presentService = new PresentService();

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<Present> getAll() {
        return presentService.getAllPresent();
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public Present getById(@PathVariable int id) {
        return presentService.getPresentById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return presentService.addPresent();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        return presentService.deletePresentByID(id);
    }

    @RequestMapping(value = "/getResultByTopQuestion", method = RequestMethod.POST)
    public List<Present> getResultByTopQuestion(@RequestBody List<Question> questions){
        for (Question question : questions) {
            System.out.println(question.toString());
        }
        return presentService.getResultByTopQuestion(questions);
    }
}
