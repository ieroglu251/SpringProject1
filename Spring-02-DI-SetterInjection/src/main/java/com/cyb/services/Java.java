package com.cyb.services;

import com.cyb.interfaces.Course;
import com.cyb.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    private ExtraSessions extraSessions;
//    private OfficeHours officeHours;

  /*  public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

   */

    @Override
    public void getTeachingHours() {
        System.out.println("Teching hours: " + 20 + extraSessions.getHourse());
    }
}
