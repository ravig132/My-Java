package com.example.Inheritence;

public class Test {
    public static void main (String [] args ){
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
        twoWheeler TW = new twoWheeler();
        TW.balance();
        TW.commute();
        MotoCycle moto = new MotoCycle();
        moto.start();
        moto.balance();
        moto.commute();
    }
}
