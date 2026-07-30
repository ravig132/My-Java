import java.util.Scanner;

public class PC59passwordChecker {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE PASSWORD CHECKER SYSTEM");
        System.out.println("Kindly make your password");
        String password = input.next();
        String pass ;
        do {
            System.out.println("Enter your password");
            pass = input.next() ;
        }while (!(password.equals(pass)));
        System.out.println("System unlocked !");

    }
}
