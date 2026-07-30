import java.util.Scanner;

public class binarySearch {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int[] ar = {1,3,4,5,8,10,12,20,50};   //sorted array
        System.out.println("Enter the number you want to search : ");
        int num = input.nextInt();

        int result = BinarySearch(ar,0,ar.length,num);
        if (result == -1){
            System.out.println("Element is not found in the array");
        }else {
            System.out.println("Element is found at "+result+" index");
        }
    }

    public static int BinarySearch(int[] ar , int low , int high ,int num){

        while(low<=high) {
            int mid = low + (high - low)/2;
            if (ar[mid] == num)
                return mid;
            if (ar[mid] < num)
                low = mid + 1;
            else
                high = mid - 1 ;

        }

    return -1 ;
    }
}
