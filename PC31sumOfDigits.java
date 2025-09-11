import java.util.Scanner;

public class PC31sumOfDigits {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE SUM OF DIGIT CALCULATOR");
        System.out.print("Enter the number to sum digits of : ");
        int Num = input.nextInt();
        int dSum = sumOfDigits(Num);
        System.out.print("The sum of digits is : "+dSum);


    }
    public static int sumOfDigits(int Num){

        int Sum = 0;
        while(Num>0){
            Sum += Num % 10;
            Num = Num / 10;
        }
        return Sum;
    }
}
