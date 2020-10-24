package com.configs;

import com.services.Java;
import com.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class CoursAppConfig {

    @Bean
public Java java(){
    return new Java();
}

@Bean
public Selenium selenium(){
    return new Selenium();
}
}
