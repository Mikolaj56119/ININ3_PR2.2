package com.company.Devices;

import com.company.Devices.Device;
import com.company.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable {
    Double weight;
    Integer doors;
    Double value;

    public Car(String model, String producer, Integer yearOfProduction) {
        super(yearOfProduction, producer, model);
    }

    public Double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public int hashCode() {
        double result = 31 * 7 * model.hashCode() *
                producer.hashCode() *
                weight * doors * value;
        return (int) result;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o instanceof Car) {
            return false;
        }
        Car car = (Car) o;
        return model == car.model &&
                producer == car.producer &&
                weight == car.weight &&
                doors == car.doors &&
                car.value == car.value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", weight=" + weight +
                ", doors=" + doors +
                ", value=" + value +
                '}';
    }

    public void turnOn() {
        System.out.println("Przekrecam kluczyk");
    }


    @Override
    public void sale() {

    }

    @Override
    public void getPrice() {

    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Próba sprzedania samochodu " + this.producer);
        if (seller.car != this) {
            System.out.println("Sprzedawca nie ma samochidu");
        } else if (buyer.cash < price) {
            System.out.println("Sorry, kupujący ma za mało pieniędzy");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Samochód " + this.producer + " został sprzedany za " + price);

        }
    }
}