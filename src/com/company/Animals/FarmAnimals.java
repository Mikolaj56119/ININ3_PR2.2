package com.company.Animals;

import com.company.Animal;

public class FarmAnimals extends Animal implements Edbile {

    public FarmAnimals(String species) {
        super(species);
    }

    @Override
    public void feed(double foodWeight, String foodType) {

    }

    @Override
    public void beEaten() {
        System.out.println("Będzie zjedzony!");
    }


    @Override
    public void sale() {

    }

    @Override
    public void getPrice() {

    }
}
