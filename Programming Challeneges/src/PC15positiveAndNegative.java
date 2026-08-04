import java.util.Scanner;

public class PC15positiveAndNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int Num = input.nextInt();
        if (Num>=1&&Num!=0){
            System.out.println("Number Is Positive");
        } else if (Num<0) {
            System.out.println("number Is Negative");

        }else {
            System.out.println("Number Is Zero");
        }
    }
}
