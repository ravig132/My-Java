import java.util.Scanner;

public class PC44deletingElementOfArray {
    public static void main ( String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE ARRAY DELETING PROGRAM ");
        int[] array = arrayUtility.inputArray();
        System.out.print("Enter the Value you want to delete from Array : ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(array,numToDelete);
        arrayUtility.displayArr(newArr);
    }
    public static int[] deleteNumber(int[] array , int numToDelete){
        int occ = Occ(array,numToDelete);
        if (occ==0){
            return array ;
        }
        int newSize = array.length-occ;
        int[] newArr = new int[newSize];


        int i = 0 , j = 0 ;
        while (i< array.length){
            if (array[i] != numToDelete){
                newArr[j] = array[i];
                j++ ;
            }
            i++;
        }
        return newArr;

    }
    public static int Occ (int[] array,int numToDelete){
        int num1 = 0 ;
        int i=0;
        while(i<array.length){
            if (array[i]==numToDelete){
                num1 += 1;
            }
            i++;
        }
        return num1 ;
    }
}
