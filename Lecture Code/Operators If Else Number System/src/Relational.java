import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE DRIVING LICENSE PORTAL");
        System.out.print("Enter the age of person : ");
        int Age = input.nextInt();
        if (Age >= 18) {
            System.out.println("You are eligible for Driving License");
        } else {
            System.out.println("You are not eligible for Driving License");

        }
    }
}
