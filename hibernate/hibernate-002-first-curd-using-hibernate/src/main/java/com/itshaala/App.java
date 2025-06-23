package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        Course course = Course.builder()
                .name("DevOps with Azure")
                .price(1000)
                .duration("1 week")
                .description("Azure, Linux, Docker, Kubernetis")
                .build();
        courseController.addCourse(course);

       // System.out.println(courseController.getCourse(3));
       // courseController.getAllCourses().forEach(System.out::println);
    }
}
