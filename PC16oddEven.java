import java.util.Scanner;

public class PC16oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int Num = input.nextInt();
        if (Num%2==0){
            System.out.println("Number is even....");
        }else {
            System.out.println("Number is odd....");
        }
    }
}
