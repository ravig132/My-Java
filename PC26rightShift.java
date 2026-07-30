import java.util.Scanner;
public class PC26rightShift {



    public static void main(String[] args) {
        System.out.println("Showcasing Right Shift operator ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number whose compliment you want : ");
        int Num = input.nextInt();
        int result = Num >> 2;
        System.out.println("Result is " +result);
    }
}


