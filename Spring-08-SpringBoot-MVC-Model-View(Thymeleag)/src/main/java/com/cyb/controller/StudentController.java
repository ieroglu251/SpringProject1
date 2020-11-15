package com.cyb.controller;

import com.cyb.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","ismail");

        int StudentId =  new Random().nextInt(1000);
        model.addAttribute("id", StudentId);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        model.addAttribute("numbers", numbers);

        LocalDate birthday = LocalDate.now().minusYears(42);
        model.addAttribute("birthday", birthday);

        Student student = new Student(1,"Steve","Ztest");
        model.addAttribute("student", student);



        return "student/welcome";
    }


    @GetMapping("/register")
    public String homePage2(){

        return "student/register";
    }
}
