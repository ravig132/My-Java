import java.util.Scanner;

public class PC57monthOfTheYear {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE MONTH ACC. TO NUMBER OF MONTH");
        System.out.print("Enter the number of the month : ");
        int month = input.nextInt() ;
        monthOfYear(month);

    }
    public static void monthOfYear(int month){
        String YearMonth = switch (month){
          case 1 -> "January";
          case 2 -> "February";
          case 3 -> "March";
          case 4 -> "April";
          case 5 -> "May";
          case 6 -> "June";
          case 7 -> "July";
          case 8 -> "August";
          case 9 -> "September";
          case 10 -> "October";
          case 11 -> "November";
          case 12 -> "December";
          default -> "Invalid" ;
        };
        System.out.println(YearMonth);
    }
}
