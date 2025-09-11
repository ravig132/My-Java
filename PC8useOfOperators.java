import java.util.Scanner;

public class PC8useOfOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = input.nextInt();
        System.out.print("Enter the value of b : ");
        int b = input.nextInt();
        System.out.println("a+b= "+(a+b));
        System.out.println("a-b= "+(a-b));
        System.out.println("a*b= "+(a*b));
        System.out.println("a/b= "+(a/b));
        System.out.println("a%b= "+(a%b));

    }
}
