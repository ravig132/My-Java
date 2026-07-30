import java.util.Scanner;

public class binarySearch {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE BINARY SEARCH");
        System.out.println("Array should be in ascending order");
        int[] arr = arrayUtility.inputArray();
        int item , mid , low = 0 ,high = ((arr.length)-1)  ;
        System.out.println("Enter the Number you want to find");
        item = input.nextInt();

        while(low < high){
            mid = (low + high)/2 ;
            if (arr[mid] == item){
                System.out.println("Item is found in "+mid+" index");
             }
            if (arr[mid] < item) {
                low = mid + 1 ;
            }else {
                high = mid - 1 ;
            }
        }

    }
}
