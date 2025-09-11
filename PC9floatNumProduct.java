import java.util.Scanner;

public class PC9floatNumProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first no. : ");
        float Num1 = input.nextFloat();
        System.out.print("Enter the second no. : ");
        float Num2 = input.nextFloat();
        float Num3 = Num1*Num2;
        System.out.print("Product of numbers are : ");
        System.out.print(Num3);

    }
}
