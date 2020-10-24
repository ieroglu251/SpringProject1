package com.services;

import com.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {
    public void getExtraHours() {
        System.out.println("Extra hours");
    }
}
