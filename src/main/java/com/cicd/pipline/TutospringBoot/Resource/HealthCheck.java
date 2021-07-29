package com.cicd.pipline.TutospringBoot.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/")
    public String healthCheck() {
        return "HEALTH CHECK OK!";
    }
}
