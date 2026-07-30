import java.util.Scanner;

public class incNumPyramid {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int i = 1 ;
        while (i<=num){
            int j = 1;
            while (j<=i){
                System.out.print(" "+j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
