package com.example.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Speciality extends NameEntity {
    @ManyToMany(mappedBy = "specialities")
    private Set<Vet> vets=new HashSet<>();
    public void addVet(Vet vet){
        vets.add(vet);
    }
}

