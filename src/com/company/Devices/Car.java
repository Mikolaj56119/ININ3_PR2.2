package com.company.Devices;

import com.company.Devices.Device;
import com.company.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable {
    public Double value;
    Double weight;
    Integer doors;

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

    @Override
    protected boolean isLastOwner(Human seller) {
        return false;
    }

    public void turnOn() {
        System.out.println("Przekrecam kluczyk");
    }

    @Override
    public Object showCar() {
        return null;
    }


    @Override
    public void sale() {

    }

    @Override
    public void getPrice() {

    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Proba sprzedania samochodu "+ this.producer);
        if(!seller.hasCar(this)){
            System.out.println("Sprzedawca nie ma samochodu");
        }else if(!buyer.hasFreeParkingLot()){
            System.out.println("Kupujacy nie ma miejsca na samochod");
        } else if(!this.isLastOwner(seller)) {
            System.out.println("Sprzedajacy nie jest ostatnim wlascicielem auta");
        }else if (buyer.cash <price){
            System.out.println("Soryy kupujacy nie ma kasy");
        }else{
            seller.cash +=price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            this.owners.add((CharSequence) buyer);
            System.out.println("Samochod "+ this.producer + " zostal sprzedany za "+ price);
        }

    }



    public void refuel() {

    }
}

