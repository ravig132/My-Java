import java.util.Objects;
import java.util.Scanner;

public class PC65inputExit {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter the number : ");
            String num = input.next();
            if (num.equalsIgnoreCase("exit")){
                break;
            }
        }

    }
}
