package com.company;

import com.company.Devices.Car;
import com.company.Devices.Phone;

import java.util.Arrays;

public class Human extends Animal {
    public final static String HUMAN_SPECIES = "Homo sapiens";
    private static final int DEFAULT_GARAGE_SIZE = 4;
    private static final Double DEFAULT_SALARY = 1600.0;
    public Double cash;
    public Car car;
    public Human animal;
    String firstName;
    String lastName;
    public Animal pet;
    public Phone mobile;
    public Car[] garage;
    private Double salary;
    private boolean device;

    Human(String firstName, String lastName) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = DEFAULT_SALARY;
        this.cash=-0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    Human(String firstName,String lastName, int garageSize) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = DEFAULT_SALARY;
        this.cash=-0.0;
        this.garage = new Car[garageSize];
    }


    public void sale(Human seller, Human buyer, double price) {
        System.out.println("NIE");
    }


    public void setSalary(Double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Należy odebrać aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty, nie ma co ukrywać dochodu :)");
        }
        else
        {
            System.out.println("Wypłata na minusie!");
        }
    }
    public void setCar(Car vehicle)
    {
        Object device;
        if(salary > vehicle.value)
        {
            System.out.println("Udało się kupić samochód za gotówkę!");
            device = vehicle.showCar();
        }
        else if(salary > (vehicle.value/12))
        {
            System.out.println("Udało się kupić samochód na kredyt!");
            device = vehicle.showCar();
        }
        else
        {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę!");
        }
    }

    public Double getSalary(){

        System.out.println("Ostatnie pobieranie danych o wypłacie: 10.09.2021. Wartość: "+ salary+ "zl");
        return this.salary;
    }
    public void getCar()
    {
        System.out.println(this.device);
    }
    //toString
    public Car getCar(Integer carPosition)
    {
        return this.garage[carPosition];
    }
    public double calculateSumOfCarsValue() {
        double sumOfValue = 0;
        for (Car car : garage
        ) {
            if (car != null)
                sumOfValue += car.value;
        }
        return sumOfValue;
    }
    public Phone getPhone() {
        return mobile;
    }

    public void setPhone(Phone phone) {
        this.mobile = phone;
        phone.phoneOwner = this;
    }
    //toString
    public String toString()
    {
        return "Imię: " + firstName + " Nazwisko: " + lastName +
                "\nZwierzę: (" + pet + ") Samochód:( " + Arrays.asList(garage) + ") " +
                "\nPensja: " + salary + "Telefon: "+ mobile;
    }

    @Override
    public void feed(double foodWeight, String foodType) {

    }

    public void sell(Human seller,Human buyer,Double price){
        System.out.println("Handel ludźmi jest zabroniony !!!");
    }
    public boolean hasCar(Car newCar){
        for(Car car : garage){
            if(car != null && car.equals(newCar)){
                return true;
            }
        }
        return false;
    }
    public boolean hasFreeParkingLot(){
        for(int i = 0;i<this.garage.length;i++){
            if(garage[i]== null){
                return true;
            }
        }
        return false;
    }
    public void removeCar(Car carToRemove) {
        for (int i = 0 ; i< garage.length ; i++) {
            if(garage[i].equals(carToRemove)){
                garage[i] = null;
                return;
            }
        }
    }
    public boolean addCar(Car car){
        for (int i = 0; i <garage.length; i++) {
            if (garage[i]  == null) {
                garage[i] = car;
                return true;
            }
        }
        return false;
    }


    @Override
    public void sale() {

    }

    @Override
    public void getPrice() {

    }
}
