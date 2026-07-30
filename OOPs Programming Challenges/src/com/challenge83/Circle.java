package com.challenge83;

public class Circle extends shape{
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(radius,2))*(Math.PI) ;
    }
}
