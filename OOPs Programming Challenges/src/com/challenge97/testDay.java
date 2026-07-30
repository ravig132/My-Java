package com.challenge97;

import java.util.Scanner;

public class testDay {
    public static void main (String [] args ){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the day in Capital Letters : ");
        String day = input.next();
        Day days = null;

        if (days.valueOf(day.toUpperCase()).isWeekDay()){
            System.out.println(day +" is week day.");
        }else {
            System.out.println(day+" is week end.");
        }


    }
}
