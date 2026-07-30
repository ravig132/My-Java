import java.util.Scanner;


public class PC7swapping {
    public static void main ( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" WELCOME TO SWAPPING STATION \n");
        System.out.print("Enter the first no. a : ");
        int a = input.nextInt();
        System.out.print("Enter the second no. b : ");
        int b = input.nextInt();
        int c ;
        c=a;
        System.out.println("Number a is : "+a+" Number b is : "+b);
        a=b;
        b=c;
        System.out.println("\nNUMBERS AFTER SWAPPING\n");
        System.out.println("Number a is : "+a+" Number b is : "+b);


    }
}
