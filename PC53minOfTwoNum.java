import java.util.Scanner;

public class PC53minOfTwoNum {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE MINIMUM NUMBER CHECKER ");
        System.out.print("Enter the number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the number : ");
        int num2 = input.nextInt();
        PC53minOfTwoNum minNum = new PC53minOfTwoNum();
        int min= minNum.min(num1,num2);
        System.out.println(min+ " is the minimum number");


    }

    public int min(int num1 , int num2){
        return num1<num2 ? num1 : num2 ;
    }
}
