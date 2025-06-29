package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

//@AllArgsConstructor
@Controller
public class CourseController {

   // @Autowired //Field Based Dependency Injection which is not recommended
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    public void add(Course course) {
        courseService.add(course);
    }

    public void update(Course course) {
        courseService.update(course);
    }

    public void delete(Course course) {
        courseService.delete(course);
    }

    public Course findById(int id) {
        return courseService.findById(id);
    }

    public List<Course> findAll() {
        return courseService.findAll();
    }
}
