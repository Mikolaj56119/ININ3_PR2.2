package com.company;

import com.company.Animals.Feedable;

public abstract class Animal implements Saleable, Feedable {
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;
    final String species;
    public String name;
    public Double weight;
    public Integer age;
    public Boolean alive;

    public Animal(String species) {
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


    public void feed() {
        if(weight>0) {
            weight++;
            System.out.println("Moja waga to: " + weight);
        }else{
            System.out.println("Zwierze nie żyje");
        }
    }
    public void takeForAWalk(String homo_sapiens) {
        weight--;
        if(weight==0){
            System.out.println("Już za późno ");
            alive=false;
        }else if(alive==false){
            System.out.println("Przykro mi ");
        }
        else{
            System.out.println("Moja waga to: " + weight);
        }
    }
    public void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("Ilosc jedzenia: " + weight);
    }
    public Double getWeight() {
        return weight;
    }


    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if(seller.pet != this) {
            System.out.println("Sprzedaz zwierzaka");
        } else if (buyer.cash < price) {
            System.out.println("Sprzedawca nie ma zwierzaka");
        } else if( this instanceof Human) {
            System.out.println("Halo policja");
        } else
            seller.cash += price;
        buyer.cash -= price;
        seller.pet = null;
        buyer.pet = this;
        System.out.println("Zwierze "+ this.name + " został sprzedany za " + price);
    }


    public String toString()
    {
        return "Imię: " + name + " Waga: " + weight  +" Lata: " + age + " Czy zyje : "+ alive;
    }

    public abstract void feed(double foodWeight, String foodType);
}