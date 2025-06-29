package com.itshaala;

import com.itshaala.config.SpringConfig;
import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        CourseController courseController = context.getBean(CourseController.class);
        courseController.update(Course.builder()
                .id(4)
                .name("spring Data jdbc 1")
                .description("abstraction layer built on top jdbc")
                .price(99)
                .duration("1 day")
                .build());
    }
}
