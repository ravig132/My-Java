import java.util.Scanner;

public class sortingAndbinarySearch {
    public static void main (String [] args ){

        int[] arr = {1,0,2,7,5,9};

        binarySearch(arr);





         


    }

    public static int[] sortedArray(int[] arr){
        int length = arr.length;
        int swap = 0 ;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 ; j++) {
                if (arr[j]>arr[j+1]){
                    swap = arr[j];
                    arr[j] = arr[j+1] ;
                    arr[j+1] = swap ;
                }

            }
        }
        return arr;
    }

    public static void binarySearch (int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number you want to find : ");
        int num = input.nextInt() ;
        int[] Arr ;
        Arr = sortedArray(arr) ;

        int result = BinarySearch(Arr ,0,Arr.length,num);
        if (result==-1){
            System.out.println("Element is not found");
        }else {
            System.out.printf("Element is found in %d index",result);
        }



    }

    public static int BinarySearch(int[] arr , int low , int high , int num) {

        while (low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] < num) {
                low = mid + 1;
            } else if (arr[mid] > num) {
                high = mid - 1 ;
            }
        }
        return -1;
    }
}
