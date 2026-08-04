import java.util.Scanner;

public class PC18leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year to check whether it is leap year or not : ");
        int Year = input.nextInt();
        if (Year%4==0 && Year%100 !=0 || Year%400==0 ){
            System.out.println("Year is Leap Year");
        }else {
            System.out.println("Year is Not Leap Year");
        }
    }

}
