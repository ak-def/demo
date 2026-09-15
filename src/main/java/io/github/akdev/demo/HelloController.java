package io.github.akdev.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping ("/Hello")
public class HelloController {

    @GetMapping("/Poorty")
    public String hello() {
        return "This is modified by Poorty Hello, Spring Boot!";
    }
}