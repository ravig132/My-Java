import javax.crypto.spec.PSource;
import java.util.Scanner;

public class PC58simpleCalc {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE SIMPLE CALCULATOR");
        System.out.println("Note : First Number should be greater");
        System.out.print("Enter the first Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second Number : ");
        int num2 = input.nextInt();

        System.out.print("Enter the operator : ");
        String operator = input.next() ;
        calc(num1,num2,operator);

    }
    public static void calc(int num1 , int num2 , String operator){
        switch (operator){
            case "+" :
                System.out.println(num1+num2);
            break;
            case "-" :
                System.out.println(num1-num2);
            break;
            case "*" :
                System.out.println(num1*num2);
            break;
            case "/" :
                System.out.println(num1/num2);
            break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
