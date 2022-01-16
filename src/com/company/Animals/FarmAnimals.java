package com.company.Animals;

import com.company.Animal;

public class FarmAnimals extends Animal implements Edbile {

    public FarmAnimals(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Będzie zjedzony!");
    }

}
