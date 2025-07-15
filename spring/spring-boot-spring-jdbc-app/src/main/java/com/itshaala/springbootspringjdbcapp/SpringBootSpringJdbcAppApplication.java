package com.itshaala.springbootspringjdbcapp;

import com.itshaala.springbootspringjdbcapp.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootSpringJdbcAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootSpringJdbcAppApplication.class, args);
        StudentController controller = context.getBean(StudentController.class);
        controller.getAllStudents().forEach(System.out::println);
    }

}
