package com.company;

public interface Saleable {
    void sale();
    void getPrice();
    void sale(Human seller, Human buyer, Double price);
}