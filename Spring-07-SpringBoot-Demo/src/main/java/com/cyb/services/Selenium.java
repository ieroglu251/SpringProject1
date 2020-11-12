package com.cyb.services;

import com.cyb.interfaces.course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements course {
    @Override
    public void getTeachingHours() {
        System.out.println("selenium print");
    }
}
