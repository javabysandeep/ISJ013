package com.itshaala.controller;

import com.itshaala.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ModelAndView student(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student");
        Student student = new Student();
        student.setId(101);
        student.setName("Pritam");
        student.setAge(22);
        mav.addObject("student", student);
        mav.addObject("id", id);
        return mav;
    }

}
