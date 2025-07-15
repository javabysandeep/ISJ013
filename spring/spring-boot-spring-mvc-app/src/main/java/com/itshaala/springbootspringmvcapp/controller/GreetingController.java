package com.itshaala.springbootspringmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/greet")
    public ModelAndView getGreeting() {
        ModelAndView mav = new ModelAndView("greeting");
        return mav;
    }
}
