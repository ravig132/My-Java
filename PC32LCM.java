import java.util.Scanner;

public class PC32LCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO LCM CALCULATOR OF TWO NUMBERS");
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        int LCM = LCM(num1,num2);
        System.out.println(LCM);

    }
    public static int LCM(int num1, int num2){
        int i=1;
        int factor =0;

        while(i<=num2){
            factor = num1*i;
            if (factor %num2==0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
