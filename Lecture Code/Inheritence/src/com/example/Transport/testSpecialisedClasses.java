package com.example.Transport;

public class testSpecialisedClasses {
    public static void main (String [] args ){
//        Car thar = new Car("Thar","4*4",4,5,"Diesel");
//
//        System.out.println(thar.name+" "+thar.model);
//
//        thar.startEngine();
//        thar.startAC();
//        thar.stopEngine();


        motorCycle royalEnfield = new motorCycle("Royal Enfield","Classic 350",2,"U","balanced");

        System.out.println(royalEnfield.name+" "+royalEnfield.model);

        royalEnfield.startEngine();
        royalEnfield.wheelie();
        royalEnfield.stopEngine();
    }
}
