package com.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE FILE READER PROGRAM");
        System.out.println("Enter the proper file address: ");
        String fileName = input.next();
        try(FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            } while (read != -1);
        } catch (FileNotFoundException exception){
            System.out.println(fileName+" file not found !");
        }catch (IOException exception){
            System.out.println("Exception Occurred, "+ exception.getMessage());
        }


    }
}
