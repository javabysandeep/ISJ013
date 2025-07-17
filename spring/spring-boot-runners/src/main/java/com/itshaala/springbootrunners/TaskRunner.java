package com.itshaala.springbootrunners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Command Line runner and inputs given to the runner");
        for (String arg : args) {
            System.out.println(arg);
        }

    }
}
