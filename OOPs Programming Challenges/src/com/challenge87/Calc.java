package com.challenge87;

import java.util.Scanner;

public class Calc {
    public static  void main ( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE EXCEPTION HANDLING PROGRAM");
        System.out.print("Enter the First Number : ");
        int first = input.nextInt() ;
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        try{
            int result = first/second ;
            System.out.printf("Your result is : %d",result);
        }catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Divide by Zero Exception Occurred");
            }else{
                throw exception ;
            }
        }








    }
}
