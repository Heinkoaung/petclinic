package com.example.petclinicdemo.model;

public enum PetType {
    Cat("white"),Hamspter("Yellow"),Dog("Dark"),Tiget("Brown");
    private String color;
    PetType(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}