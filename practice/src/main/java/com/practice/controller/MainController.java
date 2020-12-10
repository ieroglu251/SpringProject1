package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @GetMapping("/")
    public String loginPage(){

        return "loginPage";
    }

    @PostMapping("/welcome")
    public String WelcomePage(){

        return "welcome-page";
    }
}
