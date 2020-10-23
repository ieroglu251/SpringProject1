package com.cyb.services;

import com.cyb.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("teaching ours 15");
    }
}
