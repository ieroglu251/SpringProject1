package com.cyb.services;

import com.cyb.interfaces.Course;

public class Java implements Course {
    OfficeHours officeHours;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
    @Override
    public void getTeachingHours() {
        System.out.println("Teching hours: " + 20 + officeHours.getHourse());
    }
}
