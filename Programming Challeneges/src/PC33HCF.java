import java.util.Scanner;

public class PC33HCF {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE HCF CALCULATOR");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int HCF = HCF(first,second);
        System.out.print("HCF of numbers are : "+HCF);

    }
    public static int HCF(int first,int second){
        int i=1;
        int HCF = 1;
        while(i<=first){
            if (first % i == 0 && second % i == 0  ){
                HCF = i;
            }
            i++;
        }
        return HCF;
    }
}
