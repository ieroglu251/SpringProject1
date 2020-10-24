package com;

import com.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseApp {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("api" , Course.class);

        course.getTeachingHours();


    }
}
