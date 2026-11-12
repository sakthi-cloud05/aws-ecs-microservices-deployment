package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Spring Boot Microservice running successfully on AWS ECS Fargate!";
    }

    @GetMapping("/api/health")
    public String healthCheck() {
        return "STATUS: HEALTHY";
    }
}
