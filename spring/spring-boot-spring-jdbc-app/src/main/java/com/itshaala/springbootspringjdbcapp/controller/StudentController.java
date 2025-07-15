package com.itshaala.springbootspringjdbcapp.controller;

import com.itshaala.springbootspringjdbcapp.model.Student;
import com.itshaala.springbootspringjdbcapp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

   public List<Student> getAllStudents() {
       return studentService.getAllStudents();
   }
}
