import java.util.Scanner;

public class PC30factorial {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE FACTORIAL CALCULATOR");
        System.out.print("Enter the number whose factorial you want : ");
        int Num = input.nextInt();
        int Fact = factorial(Num);
        System.out.print("Factorial of "+Num+" is : "+Fact);
    }
    public static int factorial(int Num){
        int i=1;
        int factorial = 1;
        while(i<=Num){
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
