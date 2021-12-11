package com.example.demogit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/index")
    public String sayHello(){
        return  "say hello to Docker";
    }
}
