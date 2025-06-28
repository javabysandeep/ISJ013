package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//this class replaces this xml file
@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfig {

    @Bean(name = "course")
    public Course getCourse(){
        return new Course(1,"Spring Framework","java way config");
    }
}
