import java.util.Scanner;

public class hollowPyramid {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num =  input.nextInt();
        int i = 1 ;
        while(i <= num){
            int j = 1 ;
            while(j <= num ){
                if (i==1 || j==1 || i==num || j==num ){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
