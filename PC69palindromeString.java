import java.util.Scanner;

public class PC69palindromeString {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE PALINDROME STRING");
        System.out.print("Enter the word : ");
        String word = input.next();
        System.out.println("Your String is "+(isPalindrome(word) ? "Palindrome" : "Not Palindrome"));
    }
    public static boolean isPalindrome(String str){
        if (str.length() == 1){
            return true;
        }
        int lastPos = str.length() - 1 ;
        if (str.charAt(0) != str.charAt(lastPos)){
            return false ;
        }
        String newStr = str.substring(1,lastPos) ;
        return isPalindrome(newStr) ;
    }
}
