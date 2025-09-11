import java.util.Scanner;

public class PC66sumBySkippingNegative {
    public static void main ( String [] args){
        Scanner input = new Scanner(System.in);
        int[] arr = arrayUtility.inputArray();

        int sum = 0 ;
        for (int num : arr){
            if (num<0){
                continue;
            } else{
                sum += num ;
            }
        }
        System.out.println("Sum of the positive numbers is "+sum);







    }
    public static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE SUMMATION OF NUMBERS EXCEPT NEGATIVE ");
        System.out.println("Note : type 0 to get sum of positive numbers ");
        int sum = 0 ;
        while (true){
            System.out.print("Enter the number : ");
            int  num = input.nextInt();
            if (num < 0){
                continue;
            } else if (num == 0) {
                break;
            }else {
                sum += num;
            }
        }
        System.out.println("sum of positive numbers is : "+sum);



    }
}
