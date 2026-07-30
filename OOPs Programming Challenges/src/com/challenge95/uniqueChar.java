package com.challenge95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueChar {
    public static void main (String [] args ){
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your String : ");
        String userStr = input.next();

        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("Your String has %d unique characters ",unique.size());

    }
}
