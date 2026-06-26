package com.example.hello_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World from Spring Boot!";
    }

    @GetMapping("/buld")
    public String buld() {
        return "This is a build!";
    }

    @GetMapping("/test")
    public String test() {
        return "This is a test endpoint!";
    }
    
}
