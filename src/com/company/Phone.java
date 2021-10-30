package com.company;

public class Phone extends Device implements Saleable {
    final String screenSize;
    String os;

    public Phone(Double yearOfProduction, String screenSize) {
        super(yearOfProduction);

        this.screenSize = screenSize;
    }
    public void turnOn(){
        System.out.println("wciskam przycisk");
    }


    @Override
    public void turnON() {

    }

    @Override
    public void sale() {

    }

    @Override
    public Double getPrice() {
        return null;
    }
}
