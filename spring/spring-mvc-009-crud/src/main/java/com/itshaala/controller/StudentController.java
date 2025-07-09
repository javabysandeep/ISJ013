package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @GetMapping("/addForm")
    public String getAddStudentForm() {
        return "addStudentForm";
    }
    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String addStudent(
            @RequestParam("name") String name, //String name = request.getParameter("name") --> servlet
            @RequestParam("age") int age, //int age  = Integer.parseInt(request.getParameter("age"))
            @RequestParam("address") String address // String address = request.getParameter("address");
    ) {

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        studentService.addStudent(student);
        return "redirect:/students";
    }


    @GetMapping("/updateForm")
    public String getUpdateStudentForm() {
        return "updateStudentForm";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateStudent(@ModelAttribute Student student) {
        studentService.updateStudent(student);
        return "redirect:/students";
    }

    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/{id}")
    public ModelAndView getStudentById(@PathVariable("id") int id) {
        Student student = studentService.getStudentById(id);
        ModelAndView modelAndView = new ModelAndView("getStudentById");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAllStudents() {
        List<Student> studentList = studentService.getAllStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList", studentList);
        modelAndView.setViewName("students");
        return modelAndView;
    }
}
