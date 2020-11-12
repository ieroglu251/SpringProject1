package com.cyb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){


        return "home";
    }

    @GetMapping("/1")
    public String getRequestMapping1(){


        return "home";
    }

    @PostMapping("/2")
    public String getRequestMapping2(){


        return "home";
    }

    @RequestMapping("/3")
    public String getRequestMapping3(){


        return "home";
    }

    @GetMapping("/1/{name}")
    public String variablePath(@PathVariable("name") String name){

        System.out.println( "name is" + name);

        return "home";
    }
}
