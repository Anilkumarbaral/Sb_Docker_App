package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/msg")
    public String getWelcomeMsg(){
        return "Hi Anil welcome to docker hub app";
    }
}
