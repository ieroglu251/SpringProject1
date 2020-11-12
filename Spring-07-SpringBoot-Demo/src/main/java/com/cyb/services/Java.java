package com.cyb.services;

import com.cyb.interfaces.course;
import org.springframework.stereotype.Component;

@Component
public class Java implements course {
    @Override
    public void getTeachingHours() {
        System.out.println("java print");
    }
}
