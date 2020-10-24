package com.services;

import com.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {
    public void extraSession() {
        System.out.println("office Hourse");

    }
}
