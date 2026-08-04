import java.util.Scanner;

public class PC62primeOrNotForLoop {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE PRIME NUMBER CHECKER");
        System.out.print("Enter the number which you want to check : ");
        int num = input.nextInt();
        int prime = prime(num);
        isPrime(prime);
    }
    public static int prime(int num){
        if (num == 1){
            return 2 ;
        }
        int prime = 0 ;
        for (int i = 2 ; i <= num ; i++){
            if (num % i == 0){
                prime += 1 ;
            }
        }
        return prime ;
    }
    public static void isPrime(int prime){
        if (prime < 2){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not Prime");
        }
    }
}
