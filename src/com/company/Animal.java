package com.company;

public class Animal implements Saleable {
    String name;

    public Animal(String name, Double weight, Integer age, Boolean alive) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.alive = alive;
    }

    Double weight;
    Integer age;
    Boolean alive;

    @Override
    public void sale() {

    }

    @Override
    public Double getPrice() {
        return null;
    }
}


