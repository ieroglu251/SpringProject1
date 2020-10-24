package com;

import com.configs.CoursAppConfig;
import com.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CourseApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CoursAppConfig.class);

        Course course = container.getBean("java", Course.class);

        course.getTeachingHours();
    }
}
