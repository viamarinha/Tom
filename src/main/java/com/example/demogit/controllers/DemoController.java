package com.example.demogit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("/index")
    public String sayHello() {
        return "say hello to Docker";
    }

    @GetMapping("/students")

    public List<String> getStudentsList() {
        return Arrays.asList("Tom", "Cruso", "Goblin");

    }
}

