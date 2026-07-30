import java.util.Scanner;

public record togglePattern() {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int op = 1 ;
        int i = 1 ;
        while(i<=num){
            int j = 1 ;
            while (j<=i){
                System.out.print(op+" ");
                op = 1 - op ;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
