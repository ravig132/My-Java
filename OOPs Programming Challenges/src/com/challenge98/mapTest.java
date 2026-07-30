package com.challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapTest {
    public static void main (String [] args ) {
        Map<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("Pakistan", "Islamabad");
        map.put("Japan", "Tokyo");
        map.put("USA", "New York");
        map.put("Nepal", "Kathmandu");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Country Name : ");
        String countryName = input.next();

        if (map.containsKey(countryName)){
            System.out.println(map.get(countryName));
        }else{
            System.out.println("Does not Contain Country");
        }

    }

}
