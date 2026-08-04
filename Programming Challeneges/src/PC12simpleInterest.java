import java.util.Scanner;

public class PC12simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Principle Amount : ");
        int P = input.nextInt();
        System.out.print("Enter the Time Period (in years) : ");
        int T = input.nextInt();
        System.out.print("Enter the value of Rate of the Interest : ");
        float R = input.nextFloat();
        float SI = (P*R*T)/100;
        System.out.println("The Interest on "+P+" is " +SI);
        System.out.println("Total Amount = " + (SI+P));
    }
}
