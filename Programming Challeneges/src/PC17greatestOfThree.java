import java.util.Scanner;

public class PC17greatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE GREATEST NUMBER GUESS CALCULATOR");
        System.out.print("Enter the first number : ");
        int Num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int Num2 = input.nextInt();
        System.out.print("Enter the third number : ");
        int Num3 = input.nextInt();


        if (Num1>=Num2&&Num1>=Num3){
            System.out.println("Number "+Num1+" is Greater");
        } else if (Num2>=Num1&&Num2>=Num3) {
            System.out.println("Number "+Num2+" is Greater");

        }else {
            System.out.println("Number "+Num3+" is Greater");
        }


    }
}
