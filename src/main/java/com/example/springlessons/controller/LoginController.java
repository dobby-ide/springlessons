package com.example.springlessons.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/login")
    public String Login(){
        System.out.println("Login endpoint hit successfully");
        return "HI";
    }
}
