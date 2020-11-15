package com.b2b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Resource {

    @GetMapping("home")
    public String lendingPage(){

        return "index2";
    }
}
