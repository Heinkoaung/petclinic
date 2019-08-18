package com.example.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data

public class NameEntity extends BaseEntity {

    private String name;
}
