import java.util.Scanner;

public class PC39patterns {
    public static void main ( String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO PATTERNS");
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        Pattern1(num);
        Pattern2(num);
        Pattern3(num);


    }
    public static void Pattern1 (int num){
        int i=0;
        while (num>=i){
            System.out.print("*");
            int j = num;
            while(j>i){
                System.out.print(" *");
                j--;
            }
            System.out.println();
            i++;
        }
    }
    public static void Pattern2(int num){
        int i = 0 ;

        while (i<=num){
            System.out.print("*");
            int j = 0 ;
            while (j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void Pattern3(int num){
        int i = 0 ;
        while(i<num){

            System.out.println();
            i++;
        }

    }
}
