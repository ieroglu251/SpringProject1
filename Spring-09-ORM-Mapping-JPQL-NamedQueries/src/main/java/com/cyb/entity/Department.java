package com.cyb.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")

//no need but put it for now
@Getter
@Setter
@NoArgsConstructor
public class Department  {

    @Id
    private String department;
    private String division;

}
