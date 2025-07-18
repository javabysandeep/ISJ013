package com.itshaala.springbootprofiles;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
//@Profile("dev")//this will read application-dev.properties file
public class CustomRunner implements CommandLineRunner {

    //by default, it will read the application.properties file
    private Environment environment;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("username = " + environment.getProperty("mysql.username"));
        System.out.println("password = " + environment.getProperty("mysql.password"));
        System.out.println("url = " + environment.getProperty("mysql.url"));
    }
}
