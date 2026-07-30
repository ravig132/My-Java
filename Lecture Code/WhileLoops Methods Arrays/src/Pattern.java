import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO PATTERNS");
        System.out.print("Enter the number of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = input.nextInt();
        int i = 1 ;

        while( i <= rows){
            int j = 1 ;
            while (j<=col){

                System.out.print(" *");
            j++;
            }
            System.out.println();
            i++;
        }

        int n= 1 ;
        while(n <= rows ){
            int m = 1;
            while(m<=n){
                System.out.print(" *");
                m++;
            }
            System.out.println();
            n++;
        }
    }
}
