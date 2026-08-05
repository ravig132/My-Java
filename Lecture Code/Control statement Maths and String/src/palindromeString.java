import java.util.Arrays;
import java.util.Scanner;

public class palindromeString {
    public static  void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.next();
        System.out.println(reverseStr(str));
        if (str.equalsIgnoreCase(reverseStr(str))){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }



    }
    static String reverseStr(String str){
        char[] Str = str.toCharArray();
        char reverse ;
        int left = 0 ;
        int right = Str.length-1;
        while (left<right){
            reverse = Str[left];
            Str[left] = Str[right];
            Str[right] = reverse ;
            left++;
            right--;

        }

        StringBuilder reversedStr = new StringBuilder();
        for (int i = 0; i<Str.length; i++){
            reversedStr.append(Str[i]);
        }



        return reversedStr.toString();
    }

}
