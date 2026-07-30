package com.example.Inheritence;

public class twoWheeler extends Vehicle{

    protected twoWheeler(){
        numOfTyres = 2 ;
    }
    public void balance (){
        System.out.println("I am balancing on two tyres");
    }
}
