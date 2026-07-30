import java.util.Scanner;

public class PC41occurrence {
    public static void main(String[] args){
        System.out.println("WELCOME TO THE OCCURRENCE CHECKER");
     int[] array = arrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number whose occurrence you want to check : ");
        int num = input.nextInt();
     int Occurrence = Occ(array,num);
        if (Occurrence>0){
            System.out.println("The occurrence of "+num+" is "+Occurrence);
        }else{
            System.out.println("Number is not found in the array ! ");
        }
    }
    public static int Occ (int[] array,int num){
        int num1 = 0 ;
        int i=0;
        while(i<array.length){
            if (array[i]==num){
                num1 += 1;
            }
            i++;
        }
        return num1 ;
    }
}
