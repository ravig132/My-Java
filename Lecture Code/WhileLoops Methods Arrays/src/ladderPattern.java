import java.util.Scanner;

public class ladderPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the steps of the ladder: ");
        int num = input.nextInt();

        for (int outerLoop = 1 ; outerLoop<=num; outerLoop++){
            for (int row = 1 ; row<=num; row++){

                for(int spaces = 1 ; spaces<=(num-1)*outerLoop+1-num; spaces++){
                    System.out.print("  ");
                }

                for (int col = 1; col<=num; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }




    }

}