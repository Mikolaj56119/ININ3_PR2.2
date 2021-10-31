package com.company;

import com.company.Devices.Car;
import com.company.Devices.Phone;

public class Human extends Animal {

    public final static String HUMAN_SPECIES = "homo sapiens";
    public Double cash;
    String firstName;
    String lastName;
    Animal animal;
    public Car car;
    Double salary;
    public Phone mobile;


    Human(String firstName) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.cash = 0.0;
    }

    public void getSalary() {
        System.out.println();
    }

    {
    }

    public void setSalary(Double salary) {
        if(salary < 0) {
            System.out.println("Salary nie moze byc mniejsze niz 0");
        }else {
            System.out.println("Dane zostaly wyslane do systemu ksiegowego");
            System.out.println("Koniecznie odbierz aneks do umowy u pani Hani z kadr");
            System.out.println("ZUS i US juz wiedza o zmianie wyplaty i nie ma sensu ukrywac dochodu");
            this.salary = salary;
        }
    }

    public Car getCar() {
        return car;
    }

    public void checkIfHumanCanBuyCar(Car car){
        if (salary > car.getValue()){
            System.out.println("Udalo sie kupic samochod za gotowke");
            this.car = car;
        }else if(salary/12> car.getValue()) {
            System.out.println("Udalo sie kupic samochod na kredyt");
            this.car = car;
        }else {
            System.out.println("zapisz sie na studia i znajdz nowa robote albo idz po podwyzke");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "animal=" + animal +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }


    }
