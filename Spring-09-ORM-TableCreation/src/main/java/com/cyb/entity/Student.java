package com.cyb.entity;

import com.cyb.enums.Gender;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "students2")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(name = "studentFirstName")
    private String firstName;
    private String lastName;
    private String email;

    @Transient    //city will not display on the table.
    private String city;

    //Without java8
    @Temporal(TemporalType.DATE)
    private Date birtDate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;
//with java8
    @Column(columnDefinition = "DATE")
    private LocalDate loccaldate;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;
    @Column(columnDefinition = "TIME")
    private LocalTime localTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
