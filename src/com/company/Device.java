package com.company;

public abstract class Device{
    final String producer;
    final String model;
    final Integer yearOfProduction;

    public Device(Double yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract public void turnON();
}
