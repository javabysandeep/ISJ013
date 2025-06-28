package com.itshaala;

import com.itshaala.controller.CourseController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");
        CourseController courseController =
                context.getBean("controller", CourseController.class);
        courseController.addCourse(null);
    }
}
