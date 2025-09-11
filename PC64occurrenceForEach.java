import java.util.Scanner;

public class PC64occurrenceForEach {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE OCCURRENCE OF NUMBER IDENTIFIER");
        int[] arr = arrayUtility.inputArray();
        System.out.print("Enter the number whose occurrence you want to find : ");
        int checkNum =input.nextInt();
        int occ = occur(arr,checkNum);
        System.out.println("Chosen number occurred "+occ+" times.");
    }
    public static int occur(int[] arr,int checkNum){
        int occ = 0 ;
        for (int num : arr){
            if (checkNum==num){
                occ += 1 ;
            }
        }
        return occ;
    }
}
