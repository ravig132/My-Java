import java.util.Scanner;

public class PC36fibonacci {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE FIBONACCI SERIES");
        System.out.print("Enter the number to which you want fibonacci series : ");
        int num = input.nextInt();
        Fibonacci(num);
    }
    public static void Fibonacci(int num){
        int first = 0;
        int second = 1;
        int third;
        System.out.print(first+" "+second+" ");
        while((first+second)<=num){
            third = first + second ;
            first = second ;
            second = third ;
            System.out.print(third+" ");
        }

    }
}
