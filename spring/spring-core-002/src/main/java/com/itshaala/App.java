package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Course course = context.getBean("course", Course.class);
        System.out.println(course);
    }
}
