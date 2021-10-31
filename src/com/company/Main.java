package com.company;


import com.company.Devices.Car;
import com.company.Devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human me = new Human("Mikolaj");
        Human brotherInLaw = new Human ("Piotr");
        me.mobile = new Phone("Apple", "S", 5.0,2020);
        brotherInLaw.cash = 2000.0;

        System.out.println("me.mobile "+ me.mobile);
        System.out.println("brotherInLaw.mobile "+ brotherInLaw.mobile);

        me.mobile.sale(me, brotherInLaw, 1900.0);

        System.out.println("me.mobile "+ me.mobile);
        System.out.println("brotherInLaw.mobile "+ brotherInLaw.mobile);

        me.animal = brotherInLaw;
        Human sister = new Human ("Ala");
        sister.cash = 200.0;
        me.animal.sale(me, sister,20.0);

    }
}