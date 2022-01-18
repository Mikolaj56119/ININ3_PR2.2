package com.company.Devices;

public class Diesel extends Car{

    public Diesel(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }
    @Override
    public void refuel() {
        System.out.println("Tankowanie samochodu dieselem");
    }
}
