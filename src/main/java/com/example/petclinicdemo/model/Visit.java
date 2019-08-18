package com.example.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
public class Visit extends BaseEntity{
    private LocalDate localDate;
    private String description;
    @Column(name = "my_petId")
    private Integer petId;
    @ManyToOne
    private Pet pet;
}
