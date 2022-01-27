package com.company.Animals;

import com.company.Animal;

public class Pet extends Animal {
    String species = "dog";
    private Double weight;
    public Pet() {super(species);}

    public Pet(String species, Double weight) {super(species);}
    @Override
    public void feed(Double foodWeight) {
    }

    @Override
    public void feed(double foodWeight, String foodType) {

    }

    @Override
    public void sale() {

    }

    @Override
    public void getPrice() {

    }
}
