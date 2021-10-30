package com.company;

public class Human extends Animal{
    public final static HUMAN_SPECIES = "homo sapiens";

    public String firstNAme;
    public String lastNAme;
    public Animal pet;
    private Double salary;
    protected String phone;

    Human() {
        super(HUMAN_SPECIES);
        this.salary = 0.0;
    }

    public void setSalary(Double salary){
        if(salary > 2000.0){
            this.salary = salary;
        } else {
            System.out.println("chyba cie powalilo");
        }
    }

    public Double getSalary(){
        return this.salary;
    }
}
