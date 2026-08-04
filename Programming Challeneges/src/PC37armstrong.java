import java.util.Scanner;

public class PC37armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO ARMSTRONG NUMBER CHECKER");
        System.out.print("Enter the number want to check : ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is not Armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int numOfDigits = numOfDigits(num);
        int numCopy = num ;
        int finalNum = 0;
        while(numCopy>0){
            int lastDigit = numCopy % 10 ;
            numCopy /= 10 ;
            finalNum += pow(lastDigit,numOfDigits);
        }
        return finalNum == num ;
    }
    public static int pow (int num1 , int num2 ){
        int result = 1;
        int i = 0 ;
        while(i<num2){
            result *= num1 ;
            i++;
        }
                return result ;

    }
    public static int numOfDigits(int num){
        int digits = 0 ;
        while(num>0){
            digits++;
            num /= 10 ;
        }
        return digits;
    }
}

