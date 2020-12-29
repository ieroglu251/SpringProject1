package com.cinema.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "location")
@Getter
@Setter
@NoArgsConstructor
public class Location extends BaseEntity{

    private String name;
    private BigDecimal latitude;
    private BigDecimal langitude;
    private String country;
    private String state;
    private String city;
    private String address;
    private String postalCode;

    public Location(String name, BigDecimal latitude, BigDecimal langitude, String country, String state, String city, String address, String postalCode) {
        this.name = name;
        this.latitude = latitude;
        this.langitude = langitude;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
    }
}
