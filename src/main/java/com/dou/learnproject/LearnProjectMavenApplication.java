package com.dou.learnproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearnProjectMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnProjectMavenApplication.class, args);
    }

}
