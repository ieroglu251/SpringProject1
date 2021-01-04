package com.cyb.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public class BaseEntity {

    @Id
    private  Integer id;
}
