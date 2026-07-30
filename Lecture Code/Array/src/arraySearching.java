import java.util.Scanner;

public class arraySearching {
    public static void main (String []args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to find : ");
        int num = input.nextInt();

        int[] search = {10, 20, 30, 80, 90, 70, 60, 40, 45, 0};
        boolean isFound = Searching(num,search);
        if (isFound){
            System.out.println("Number is found ");
        }else{
            System.out.println("Number is not found");
        }
    }
    public static boolean Searching (int num,int[] search){
        int i = 0 ;
        while(i< search.length){
            if (search[i]==num){
                return true ;
            }
            i++;
        }
        return false ;


    }


    }

