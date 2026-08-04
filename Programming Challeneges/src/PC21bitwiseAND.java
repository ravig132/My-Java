import java.util.Scanner;

public class PC21bitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise AND operator : ");
        System.out.print("Enter the first number : ");
        int Num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int Num2 = input.nextInt();
        int result = Num1 & Num2 ;
        System.out.println("Result is "+result);
    }

}
