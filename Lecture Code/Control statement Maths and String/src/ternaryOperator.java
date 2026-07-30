import java.util.Scanner;

public class ternaryOperator {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE NUMBER CHECKER");
        System.out.print("Enter the Number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = input.nextInt();

        int greaterNumber ;
        if (num1>num2){
            greaterNumber = num1 ;
        }else {
            greaterNumber = num2 ;
        }
        System.out.println(greaterNumber+" is the greater number");

        int gNum = num1 > num2 ? num1 : num2 ;
        System.out.println(gNum+ " is the greater number");


    }
}
