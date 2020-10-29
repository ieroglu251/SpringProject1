package com.services;

import com.interfaces.Course;
import com.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Java implements Course {

    private ExtraSessions extraSessions;

//    @Autowired
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("java" + (extraSessions.getHours()));
    }

    @Value("istructor")
    private String instructor;

    @Value("days")
    private String [] days;



}
