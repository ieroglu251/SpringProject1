package com.cyb;

import com.cyb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JpqlApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpqlApplication.class, args);
	}

	@PostConstruct
	public void getEmployeeDetails(){

		System.out.println(employeeRepository.getEmployeeDetails());
		System.out.println(employeeRepository.getEmployeeSalary());

		System.out.println( "Email is: " + employeeRepository.getEmployeeEmail("myakovlivf@ucsd.edu").get()  );
	}

}
