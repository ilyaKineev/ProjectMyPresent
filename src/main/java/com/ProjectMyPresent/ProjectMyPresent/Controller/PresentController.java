package com.ProjectMyPresent.ProjectMyPresent.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/present")
public class PresentController {
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public String getAll() {
        return "getAll present";
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Long id) {
        return "getById present " + id;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "add present";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id) {
        return "delete present" + id;
    }
}
