package com.cinema.entity;

import com.cinema.enums.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Getter
@Setter
@NoArgsConstructor
public class Account extends BaseEntity{
    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private UserRole role=UserRole.USER;


    @OneToOne(mappedBy = "account")
    private User user;

    public Account(String name, String address, String country, String city, String state, Integer age, String postalCode, UserRole role) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.city = city;
        this.state = state;
        this.age = age;
        this.postalCode = postalCode;
        this.role = role;
    }
}
