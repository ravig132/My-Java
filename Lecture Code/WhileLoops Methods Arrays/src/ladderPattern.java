import java.util.Scanner;

public class ladderPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n*n; i++){
            for(int j=1; j<=n*n; j++){
                if(i<=n &&j<=n){
                    System.out.print("*");}

                if(i<=2*n &&j<=2*n && i>n&&j>n){
                    System.out.print("*");
                }
                if(i<=3*n &&j<=3*n&&i>2*n&&j>2*n){
                    System.out.print("*");
                }
                if(i<=4*n &&j<=4*n&&i>3*n&&j>3*n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }

            }
            System.out.println();
        }


    }

}