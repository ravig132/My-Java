import java.util.Scanner;

public class PC29sumOfOdd {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO ODD NUMBER SUM CALCULATOR");
        System.out.print("Enter the number to which you want the odd number sum of : ");
        int Num = input.nextInt();
        int Sum = oddSum(Num);
        System.out.print("Sum of odd numbers is : "+Sum);
    }
    public static int oddSum(int Num){
        int i=1;
        int oddSum = 0;
        while(i<=Num){
            if (i%2 != 0){
                oddSum += i;
            }

            i++;
        }
        return oddSum;
    }

}
