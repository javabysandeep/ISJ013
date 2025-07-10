package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")//optional
public class StudentController {

    private StudentService studentService;

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
        return "Student Created";
    }


    //@RequestMapping(value = "/update", method = RequestMethod.PUT)
    @PutMapping
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "Student Updated";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
        return "Student Deleted";
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
