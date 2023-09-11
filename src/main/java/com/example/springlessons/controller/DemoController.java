package com.example.springlessons.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo")
    public String Demo(){
        //debugging-- who is the authorized user??
        var u = SecurityContextHolder.getContext().getAuthentication();
        u.getAuthorities().forEach(a-> System.out.println(a.toString()));
        System.out.println(u.getName());
        System.out.println(u.getAuthorities());

        return "DEMO";
    }
}
