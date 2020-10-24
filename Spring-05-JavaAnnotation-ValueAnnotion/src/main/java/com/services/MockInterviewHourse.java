package com.services;

import com.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHourse implements ExtraSession {
    public void extraSession() {
        System.out.println("Mock interview hourse");

    }
}
