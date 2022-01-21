package com.ProjectMyPresent.ProjectMyPresent.Controller;


import com.ProjectMyPresent.ProjectMyPresent.Service.QuestionService;
import com.ProjectMyPresent.ProjectMyPresent.model.json.Question;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/question")
public class QuestionController {

    QuestionService questionService = new QuestionService();

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<Question> getAll() {
        return questionService.getAllQuestion();
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public Question getById(@PathVariable int id) {
        return questionService.getQuestionById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return questionService.addQuestion();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        return questionService.deleteQuestion(id);
    }

    @RequestMapping(value = "/gettop", method = RequestMethod.GET)
    public List<Question> getTop() {
        return questionService.getTopQuestion();
    }
}
