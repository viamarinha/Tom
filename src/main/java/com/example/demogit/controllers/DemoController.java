package com.example.demogit.controllers;

import com.example.demogit.models.Professeur;
import com.example.demogit.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class DemoController {

    @GetMapping("/index")
    public String sayHello() {
        return "say hello to Docker";
    }

    @GetMapping("/students")

    public Professeur getStudentsList() {
        Student igor = new Student("Igor", 12);
        Student misha = new Student("Misha", 14);
        return   Professeur.builder().name("Toto").studentList(Arrays.asList(igor,misha)).build();


    }
}

