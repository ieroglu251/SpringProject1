package com.cyb.entity;

import com.cyb.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")

//no need but put it for now
@Getter
@Setter
@NoArgsConstructor
public class Employee extends  BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private Long salary;


    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    @ManyToOne

    private Region region;

    @Enumerated(EnumType.STRING)
    private Gender gender;


}
