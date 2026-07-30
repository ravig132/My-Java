package com.challenge83;

public class Square extends shape{
    private double side ;

    public Square(double side){
        this.side = side ;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return Math.pow(side,2) ;
    }
}
