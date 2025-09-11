import java.util.Scanner;

public class PC38palindromeNum {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE PALINDROME NUMBER CHECKER");
        System.out.print("Enter the number you want to check : ");
        int num = input.nextInt();
        boolean isPalindrome = palindrome(num);
        if (isPalindrome){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
    public static boolean palindrome (int num) {
        int num1 = 0 ;
        int numCopy = num ;
        while(numCopy>0){
            num1 += numCopy % 10;
            numCopy /= 10 ;
            num1 *= 10 ;
        }

        return num1/10 == num;
    }
}
