package com.company.Devices;

import com.company.Human;
import com.company.Saleable;

public class Phone extends Device implements Saleable {
    final Double screenSize;
    String os;

    public Phone(String producer, String model, Double screenSize, Integer yearOfProduction) {
        super(yearOfProduction, producer, model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Klikam guzik wlaczajacy telefon");
    }

    @Override
    public void sale() {

    }

    @Override
    public void getPrice() {

    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Próba sprzedania telefonu " + this.producer);
        if(seller.mobile != this) {
            System.out.println("Sprzedawca nie ma telegonu");
        } else if (buyer.cash < price) {
            System.out.println("Sorry, kupujący ma za mało pieniędzy");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            System.out.println("Telefon "+ this.producer + " został sprzedany za "+ price);
        }
    }
}