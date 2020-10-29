package com.configs;

import com.interfaces.ExtraSessions;
import com.services.Java;
import com.services.OfficeHours;
import com.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com")
@PropertySource("ClssPath:application.properties")
public class CoursAppConfig {

    @Bean
public Java java(){
    return new Java(extraSessions());
}

@Bean
public Selenium selenium(){
    return new Selenium();
}

//Next to methods doing the same purpose
//@Bean
//public OfficeHours officeHours(){
//        return new OfficeHours();
//}

@Bean
public ExtraSessions extraSessions(){
        return new OfficeHours();
}
}
