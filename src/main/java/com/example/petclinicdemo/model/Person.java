package com.example.petclinicdemo.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class Person extends BaseEntity {

    private String firstname;
    private String lastname;
}

