import java.util.Scanner;

public class PC55absoluteNumber {
    public static void main ( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE ABSOLUTE NUMBER");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int result = num >= 0 ? num : -num ;
        System.out.println("The absolute number of "+num+" is "+result);

    }
}
