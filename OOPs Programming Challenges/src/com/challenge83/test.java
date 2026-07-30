package com.challenge83;

public class test {
    public static void main (String [] args){
        Circle circle = new Circle(7);
        Square square = new Square(8);
        circle.setRadius(5);
        square.setSide(5);
        double areaOfCir = circle.calculateArea();
        double areaOfSquare = square.calculateArea();
        System.out.printf("Area of Square is : %f\n",areaOfSquare);
        System.out.printf("Area of Circle is : %f",areaOfCir);
    }
}
