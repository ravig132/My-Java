public class bubbleSortingArray {
    public static void main ( String [] args){
        System.out.println("WELCOME TO THE SORTED ARRAY");
        int[] arr = arrayUtility.inputArray();
        int temp,n = arr.length;
        for (int i= n; i > 0; i--) {
            for (int j = 0; j < i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
        System.out.println("Sorted array is : ");
        for (int k = 0; k < n; ++k ) {
            System.out.print(arr[k]+" ");
        }
    }
}