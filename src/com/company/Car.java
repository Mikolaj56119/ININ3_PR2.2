package com.company;

public class Car extends Device {
    public Double value;
    String color;
    Double engineCapacity;
    String engineSound;

    public Car(Double value, String color, Double engineCapacity, String engineSound, String yearOfProduction) {
        super(yearOfProduction);
        this.value = value;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.engineSound = engineSound;
    }

    @Override
    public void turnOn(){
        System.out.println("przekręcam kluczyk");
    }
}
