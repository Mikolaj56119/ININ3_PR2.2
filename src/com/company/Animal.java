package com.company;

public class Animal implements Saleable {
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;

    final String species;
    String name;
    private Double weight;
    Integer age;
    Boolean alive;

    Animal(String species) {
        this.species = species; //wartosc z parametru
        this.alive = true; //wartosc domyslna
        if (this.species == "canis") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species == "felis") {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    void feed() {
        weight++;
        System.out.println("Moja waga to: " + weight);
    }

    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("Moja waga to: " + weight);
    }

    Double getWeight() {
        return weight;
    }

    @Override
    public void sale() {
        System.out.println("Sprzedaj");
    }

    @Override
    public void getPrice() {


    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Próba sprzedania zwierzaka " + this.name);
        if (seller.animal != this) {
            System.out.println("Sprzedawca nie ma zwierzaka");
        } else if (buyer.cash < price) {
            System.out.println("Sorry, kupujący ma za mało pieniędzy");
        }else if(this.species == Human.HUMAN_SPECIES){
            System.out.println("Hallo Policja, nie ma takiego sprzedawania ludzi");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.animal = null;
            buyer.animal = this;
            System.out.println("Zwierzak " + this.name + " został sprzedany za " + price);

        }
    }
}