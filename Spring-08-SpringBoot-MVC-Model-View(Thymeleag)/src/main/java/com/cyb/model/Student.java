package com.cyb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Student {

    private int id;
    private String firstName;
    private  String lastName;


}
