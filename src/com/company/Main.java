package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.pet = new Animal( species: "canis");
        Animal cat = new Animal( species: "felis");

        System.out.println(dog);
        System.out.println(me);

        me.pet = cat;
        System.out.println();

        me.feed();
        me.age = 3;

    }
}
