package com.challenge77.utils;
import com.challenge77.geometry.circle;
import com.challenge77.geometry.rectangle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        circle Circle = new circle();
        rectangle Rectangle = new rectangle();

        System.out.print("Enter the radius of the Circle : ");
        int radius = input.nextInt();
        double areaOfCircle = cirArea(radius);
        System.out.printf("The area of the circle is : %f ", areaOfCircle);
        System.out.println();
        System.out.print("Enter the length : ");
        int length = input.nextInt();
        System.out.print("Enter the Breadth : ");
        int breadth = input.nextInt();
        int areaOfRectangle = recArea(length,breadth);
        System.out.printf("The area of the rectangle is : %d",areaOfRectangle);




}
    public static double cirArea (double radius){
        int sqRadius = (int) Math.pow(radius,2);
        return Math.PI*sqRadius;
    }

    public static int recArea(int length , int breadth){
        return length*breadth ;
    }

}
