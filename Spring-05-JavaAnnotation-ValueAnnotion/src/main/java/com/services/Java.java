package com.services;

import com.interfaces.Course;
import com.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired
    @Qualifier("officeHours")
    private ExtraSession extraSession;

    public Java(   ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    public void getTeachingHours() {
         extraSession.extraSession();
    }


}
