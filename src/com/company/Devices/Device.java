package com.company.Devices;

import com.company.Human;

public abstract class Device {
    final Integer yearOfPRoduction;
    final String producer;
    final String model;
    public Human phoneOwner;

    public Device(Integer yearOfPRoduction, String producer, String model) {
        this.yearOfPRoduction = yearOfPRoduction;
        this.producer = producer;
        this.model = model;
    }

    abstract public void turnOn();

    public abstract Object showCar();

    @Override
    public String toString() {
        return "Device{" +
                "yearOfPRoduction=" + yearOfPRoduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}