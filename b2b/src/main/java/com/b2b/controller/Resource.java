package com.b2b.controller;

import com.b2b.model.LogIn;
import com.b2b.model.Student;
import com.b2b.service.LevelOne;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/b2b")
public class Resource {

    @GetMapping("/login")
    public String lendingPage(Model model){

        model.addAttribute("login", new LogIn());

        return "log-in";
    }

    @PostMapping("/practice")
    public String practicePage(){

        return "practice-page";

    }

    @GetMapping("/register")
    public String getRegister(Model model){

        model.addAttribute("register", new Student());

        return "register-form";
    }

    @GetMapping("/startPractice")
    public String getStart(Model model){

        model.addAttribute("sum", new LevelOne());
        model.addAttribute("answer", new LevelOne());
        return "practice-landing-page";
    }




}
