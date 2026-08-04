import java.util.Scanner;

public class PC74guessingGame {
    int random ;

    PC74guessingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }

    /**
     *
     * @param guessNumber the number player guessed is :
     * @return
     * - negative if the guessed number is smaller
     * - 0 if the guessed number is same
     * - positive if the guessed number is greater
     */

    int guess(int guessNumber){
        return guessNumber - random ;
    }

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        PC74guessingGame Game = new PC74guessingGame();
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
        int guess ;
        int result ;
        do {
            System.out.print("Guess the number between 0 - 99 : ");
            guess = input.nextInt();
            result = Game.guess(guess);
            if (result == 0){
                System.out.println("Congratulations ! You won the Game.");
            }if (result < 0){
                System.out.println("Guess higher number.");
            }if (result > 0){
                System.out.println("Guess lower number.");
            }
        }while (result != 0);


    }
}
