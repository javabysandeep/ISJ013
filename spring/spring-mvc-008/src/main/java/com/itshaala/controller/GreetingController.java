package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView greeting() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("greeting");
        List<String> list = List.of("Gunaji", "Pritam", "Vaibhav", "Pravin", "Lokesh", "Komal", "Srushti");

        mav.addObject("data", list);
        return mav;
    }
}
