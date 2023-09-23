package com.heydieproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@SpringBootApplication
public class JenkinsAutomationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsAutomationApplication.class, args);
    }

    @GetMapping
    public String welcomeMessage() {
        log.info("log jenkins automation !!");
        return "Welcome Jenkins Automation TEST";
    }

}
