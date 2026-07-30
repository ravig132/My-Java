import java.util.Scanner;

public class recursion {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the the recursive factorial Calculator");
        System.out.print("Enter the number whose factorial you want : ");
        int num = input.nextInt();
        long fact = factorialIterative(num);
        long recursiveFact = factorial(num);
        System.out.println("Factorial of your number  is "+recursiveFact);


    }
    public static long factorialIterative(int num){
        long result = 1 ;
        for (int i = 1; i<=num ;i++) {
            result *= i;
        }


        return result ;
    }

    public static long factorial(int num){
        if (num == 1){
            return 1 ;
        }
        return num *= factorial(num-1) ;

    }
}
