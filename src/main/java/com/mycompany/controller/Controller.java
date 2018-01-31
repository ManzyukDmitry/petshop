package com.mycompany.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    //TODO: There must be someService with @Autowired

    // Now it is only for demonstrate that everything is ok
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "Welcome to the Pet Shop!";
    }

    //TODO: There must be methods with all request routes

}