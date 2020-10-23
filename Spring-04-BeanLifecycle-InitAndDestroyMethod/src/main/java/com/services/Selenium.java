package com.services;

import com.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachHours() {
        System.out.println("java hours");
    }

    public void myInitMethod(){
        System.out.println("Execute init");
    }

    public void myDestroyMethod(){
        System.out.println("Execute destroy method");
    }
}
