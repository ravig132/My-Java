import java.util.Scanner;

public class PC13compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO COMPOUND INTEREST CALCULATOR");
        System.out.print("Enter the amount which you want on compound interest : ");
        float Principal = input.nextFloat();
        System.out.print("Enter the rate of the interest : ");
        float Rate = input.nextFloat();
        System.out.print("Enter the time period of the interest ( in years ) : ");
        float Time = input.nextFloat();
        double Amount= Principal*Math.pow((1+ Rate/100),Time);
        System.out.println("The total amount after Compound Interest on "+ Principal+" is : " + Amount);
        System.out.println("The Compound Interest is : "+(Amount-Principal));


    }
}
