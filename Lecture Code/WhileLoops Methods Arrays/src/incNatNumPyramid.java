import java.util.Scanner;

public class incNatNumPyramid {
    public static void main ( String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int i = 1 ;
        int n = 1 ;
        while (i<=num){
            int j = 1 ;
            while (j<=i){
                System.out.print(n+" ");
                n++ ;
                j++ ;
            }
            System.out.println();
            i++;
        }
    }
}
