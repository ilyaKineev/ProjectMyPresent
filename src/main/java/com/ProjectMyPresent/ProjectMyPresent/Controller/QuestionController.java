package com.ProjectMyPresent.ProjectMyPresent.Controller;


import com.ProjectMyPresent.ProjectMyPresent.Service.MainService;
import com.ProjectMyPresent.ProjectMyPresent.Service.QuestionService;
import com.ProjectMyPresent.ProjectMyPresent.model.json.JsonQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    MainService mainService;

    QuestionService questionService = new QuestionService();

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<JsonQuestion> getAllQuestion() {
        return mainService.getAllQuestion();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public JsonQuestion getById(@PathVariable int id) {
        return mainService.getQuestionById(id);
    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add() {
//        return questionService.addQuestion();
//    }

//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public String delete(@PathVariable int id) {
//        return questionService.deleteQuestion(id);
//    }

    @RequestMapping(value = "/top", method = RequestMethod.GET)
    public List<JsonQuestion> getTop() {
        return mainService.getTopQuestion();
    }
}
