import java.util.Scanner;

public class switchCalc {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt() ;
        System.out.print("Enter the operator : ");
        String operator = input.next();

        switch (operator){
            case "+" :
                System.out.println("sum : "+(num1+num2));
                break;
            case "-" :
                System.out.println("difference : "+(num2-num1));
                break;
            case "*" :
                System.out.println("product : "+(num1*num2));
                break;
            case "/":
                System.out.println("division : "+(num2/num1));
                break;
            default:
                System.out.println("invalid operation");
        }
    }
}
