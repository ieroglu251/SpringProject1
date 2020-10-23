package com.cyb.services;

import com.cyb.interfaces.Course;
import lombok.Data;


public class Java implements Course {



    @Override
    public void getTeachingHours() {
        System.out.println("Teching hours: " + 20 );
    }
}
