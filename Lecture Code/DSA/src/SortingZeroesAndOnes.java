public class SortingZeroesAndOnes {
    public static void main (String [] args ){
        int [] arr = {0,1,0,1,1,1,0,0,1,0};

        int [] newArr = sortingZeroOne(arr);

        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }

    public static int [] sortingZeroOne(int [] arr){
        int left = 0 ;
        int right =  arr.length - 1 ;
        int temp = 0 ;

        while(left<right){
            if (arr[left] == 1 & arr[right] == 0){
                temp = arr[left] ;
                arr[left] = arr[right] ;
                arr[right] = temp ;
            }
            if(arr[left] == 0 ){
                left++ ;
            }
            if (arr[right] == 1 ){
                right-- ;
            }

        }

        return arr  ;
    }
}
