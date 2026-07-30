import java.util.Scanner;

public class PC34primeNum {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE PRIME NUMBER CHECKER");
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int Prime = Prime(num);
        if (Prime<2){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not Prime");
        }

    }
    public static int Prime(int num){
        int i = 2;
        int Prime = 0 ;
        while(i<=num){
            if (num % i == 0){
                Prime += 1 ;
            }

            i++;
        }
        return Prime;
    }
}
