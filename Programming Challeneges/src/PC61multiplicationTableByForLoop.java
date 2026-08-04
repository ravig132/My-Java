import java.util.Scanner;

public class PC61multiplicationTableByForLoop {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE MULTIPLICATION TABLE");
        System.out.print("Enter the number whose table you want to print : ");
        int num = input.nextInt();

        System.out.println("Multiplication table of "+num+" is : ");

        for (int i = 1 ; i <= 10 ; i++){
            int multiple = i*num ;
            System.out.println(num+" * "+i+" = "+multiple);
        }
    }
}
