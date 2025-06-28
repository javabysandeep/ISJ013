package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Hello world!
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Environment environment = context.getEnvironment();
        System.out.println(environment.getProperty("id"));
        System.out.println(environment.getProperty("name"));
        System.out.println(environment.getProperty("desc"));
    }
}
