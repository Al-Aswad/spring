package com.aswad.belajarapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeComtroller {
    
    @GetMapping
    public String welcome(){
        return "Welcome to Spring Boot";
    }
}
