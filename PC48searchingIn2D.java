import java.util.Scanner;

public class PC48searchingIn2D {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO SEARCHING PROGRAM OF 2D ARRAY");
        int[][] array = arrayUtility.input2DArray();
        System.out.print("Enter the number you want to search : ");
        int num = input.nextInt();
        boolean Searching = Search(array,num);
        if (Searching){
            System.out.println("Number is found in the Array . ");
        }else {
            System.out.println("Number is not found in the Array !");
        }
    }
    public static  boolean Search (int[][] array , int num){
        int i = 0 ;
        while(i < array.length){
            int j = 0 ;
            while(j < array[i].length){
                if (array[i][j]==num){
                    return true ;
                }
                j++;
            }
            i++;
        }

        return false ;
    }
}
