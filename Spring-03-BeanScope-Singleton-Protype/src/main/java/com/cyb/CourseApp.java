package com.cyb;

import com.cyb.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseApp {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");


        Course course1 = container.getBean("java", Course.class);
        Course course2 = container.getBean("java", Course.class);
        System.out.println("pointing to same object: " + (course1==course2));
        System.out.println("memory location for course 1: "  + course1);
        System.out.println("memory location for course2: "  + course2);
    }
}
