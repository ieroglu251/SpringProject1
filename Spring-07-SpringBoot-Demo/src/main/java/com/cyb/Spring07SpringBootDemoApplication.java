package com.cyb;

import com.cyb.interfaces.course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {

	public static void main(String[] args) {

	ApplicationContext container = SpringApplication.run(Spring07SpringBootDemoApplication.class, args);

	course crs = container.getBean("java", course.class);

		  crs.getTeachingHours()  ;
	}

}
