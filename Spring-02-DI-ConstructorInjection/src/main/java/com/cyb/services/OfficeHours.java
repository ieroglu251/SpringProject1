package com.cyb.services;

import com.cyb.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {
    @Override
    public int getHourse() {
        return 5;
    }
}
