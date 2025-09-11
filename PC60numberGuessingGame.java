import java.sql.SQLOutput;
import java.util.Scanner;

public class PC60numberGuessingGame {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int num = 45 , guess ;
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
        do {
            System.out.println("Guess the number between 0 to 50");
            guess = input.nextInt();
        }while(guess != num);
        System.out.println("You have successfully guessed the number");
    }
}
