package com.cyb;

import com.cyb.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DrivedqueryApplication {

	@Autowired
	RegionRepository regionRepository;

	public static void main(String[] args) {
		SpringApplication.run(DrivedqueryApplication.class, args);
	}

	@PostConstruct
	public void testRegion(){

		System.out.println("------------------region---------------------------");
		System.out.println(regionRepository.findByCountry("Canada"));
		System.out.println(regionRepository.findDistinctByCountry("Canada"));

	}

}
