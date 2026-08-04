import java.util.Scanner;

public class PC67evenNumbersByContinue {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE SERIES OF EVEN NUMBER");
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        for (int i = 0 ; i <= num ; i++){
            if (i % 2 != 0){
                continue;
            }else {
                System.out.print(i+" ");
            }
        }
    }
}
