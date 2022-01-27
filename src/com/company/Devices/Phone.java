    package com.company.Devices;

    import com.company.Human;
    import com.company.Saleable;

    import java.net.URL;
    import java.util.List;

    public class Phone extends Device implements Saleable {
        final Double screenSize;
        String os;
        final static String DEFAULT_SERVER_ADDRESS = "22.48.16.2254";
        final static String DEFAULT_PROTOCOL = "HTTPS";
        final static String DEFAULT_VERSION = "11.15.4";
        final static String DEFAULT_APPLICATION = "INTELLIJ";

        public Phone(String model,String producer,Integer yearOfProduction, Double screenSize) {
            super(yearOfProduction, producer, model);
            this.screenSize = screenSize;
        }

        @Override
        public void turnOn() {

            System.out.println("Włączenie telefonu");
        }

        @Override
        public Object showCar() {
            return null;
        }


        @Override
        public void sale(Human seller, Human buyer, Double price) {
            System.out.println("Telefon na sprzedarz " + this.producer);
            if(seller.mobile != this) {
                System.out.println("Sprzedający nie ma telefonu");
            } else if (buyer.cash < price) {
                System.out.println("Za mało hajsu!");
            } else {
                seller.cash += price;
                buyer.cash -= price;
                seller.mobile = null;
                buyer.mobile = this;
                System.out.println("Telefon "+ this.producer + " sprzedany za "+ price);
            }
        }
        @Override
        public String toString() {
            return "Phone{" + "yearOfPRoduction=" + yearOfPRoduction + ", producer='" + producer + '\'' +  ", model='" + model + '\'' +
                    ", screenSize=" + screenSize +
                    ", os='" + os + '\'' +
                    '}';
        }

        @Override
        protected boolean isLastOwner(Human seller) {
            return false;
        }

        @Override
        public void sale() {

        }

        @Override
        public void getPrice() {

        }



        public void installAnApp(String nazwaAplikacji) {
            installAnApp(nazwaAplikacji, DEFAULT_VERSION);
        }

        public void installAnApp(String nazwaAplikacji, String wersjaAplikacji) {
            installAnApp(nazwaAplikacji, wersjaAplikacji, DEFAULT_SERVER_ADDRESS);
        }

        public void installAnApp(String nazwaAplikacji, String wersjaAplikacji, String adresServera) {
            System.out.println("Zainstalowano aplikacje " + nazwaAplikacji + " wersja:  " + wersjaAplikacji +
                    " server:  " + adresServera);
        }

        public void installAnApp(List<String> applicationsToInstall) {
            for (String application : applicationsToInstall) {
                installAnApp(application);
            }
        }

        public void installAnApp(URL url) {
            System.out.println("url: " + url);
            System.out.println("Aplikacja: " + DEFAULT_APPLICATION + " Wersja " + DEFAULT_VERSION);
        }


    }