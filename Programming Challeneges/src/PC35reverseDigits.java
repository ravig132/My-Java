import java.util.Scanner;

public class PC35reverseDigits {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE DIGIT REVERSER");
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        int reverse = Reverse(num);
        System.out.println("The number after reversing the digit is : "+(reverse)/10);
    }
    public static int Reverse(int num){
        int digit = 0;
        while(num>0){
            digit += num % 10;
            num = num / 10;
            digit *= 10;
        }
        return digit;
    }
}
