package com.cyb.controller;

import com.cyb.enums.Gender;
import com.cyb.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add( new Mentor("mike", "smith", 45, Gender.Male));
        mentorList.add( new Mentor("Tom", "smith", 45, Gender.Male));
        mentorList.add( new Mentor("Ammy", "smith", 45, Gender.Male));

        model.addAttribute("mentors", mentorList);

return "mentor/mentor-List";

    }
}
