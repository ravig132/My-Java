package in.Exception;

import java.util.Scanner;

public class Calculator {
    public static void main (String [] args ){
    a();
    }

    private static void a (){
     b();
    }

    private static void b (){
    c();
    }

    private static void c (){
    d();
    }

    private static void d (){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO DIVISION CALCULATOR");
        System.out.println("Please Enter Your Two Numbers : ");
        int first = input.nextInt();
        int second = input.nextInt();
        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        }
        catch(ArithmeticException exception){
            System.out.printf("%s, Enter valid values ",exception.getMessage());
        }
        catch (Throwable th ){
            System.out.println("General Exception");
            throw th ;
        }finally {
            System.out.println("I am in finally");
        }

    }


}
