import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        System.out.println("WELCOME TO TICKET DISCOUNT CALCULATOR");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age : ");
        int Age = input.nextInt();
        System.out.print("Are you female ? ( True/False )");
        boolean isFemale = input.nextBoolean();
        if (Age<5){
            System.out.println("Discount on Ticket is 75% ");
        } else if (Age>60&&isFemale) {
            System.out.println("Discount on Ticket is 50% ");

        } else if (isFemale) {
            System.out.println("Discount on Ticket is 50% ");

        } else if (Age>60) {
            System.out.println("Discount on Ticket is 25% ");

        }
        else {
            System.out.println("NO DISCOUNT!");
        }

    }
}
