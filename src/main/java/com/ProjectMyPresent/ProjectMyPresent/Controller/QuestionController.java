package com.ProjectMyPresent.ProjectMyPresent.Controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/question")
public class QuestionController {
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public String getAll() {
        return "getAll question";
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Long id) {
        return "getById question " + id;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "add question";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id) {
        return "delete question " + id;
    }

    @RequestMapping(value = "/gettop", method = RequestMethod.GET)
    public String getTop() {
        return "getTop question";
    }
}
