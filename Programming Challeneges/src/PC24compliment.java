import java.util.Scanner;

public class PC24compliment {
    public static void main(String[] args) {
        System.out.println("Showcasing Bitwise NOT operator ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number whose compliment you want : ");
        byte Num = input.nextByte();
        int result = ~Num;
        System.out.println("Result is " +result);
    }
}

