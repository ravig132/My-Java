import java.util.Scanner;

public class PC19gradesOfStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE GRADE CALCULATOR");
        System.out.print("Enter the marks of Hindi : ");
        float Hindi = input.nextFloat();
        System.out.print("Enter the marks of English : ");
        float English = input.nextFloat();
        System.out.print("Enter the marks of Maths : ");
        float Maths = input.nextFloat();
        System.out.print("Enter the marks of Science : ");
        float Science = input.nextFloat();
        System.out.print("Enter the marks of SSt : ");
        float SSt = input.nextFloat();
        double Percentage = (Hindi + English + Maths + Science + SSt)/5;
        if (Hindi<=30 ||English<=30||Maths<=30 ||Science<=30 ||SSt<=30 ){
            System.out.println("You are Fail in either one or two subject ");
        }

        if (Percentage>90&&Percentage<=100){
            System.out.println("You got grade A");
        } else if (Percentage>75&&Percentage<=90) {
            System.out.println("You got grade B");
        } else if (Percentage>60&&Percentage<=75) {
            System.out.println("You got grade C ");
        } else if (Percentage>30&&Percentage<=60) {
            System.out.println("You got grade D");
        } else if (Percentage>=0&&Percentage<=30) {
            System.out.println("You got grade F");
        }else {
            System.out.println(" ERROR !");
        }


    }
}
