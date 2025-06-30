package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class GreetingController {

    //map url and method
    //specify the http request method type[GET, POST, DELETE, PUT]
    //@RequestMapping(value = "/greet", method = RequestMethod.GET)
    @GetMapping("/greet")
    public ModelAndView greet(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greet");
        return modelAndView;
    }
}
