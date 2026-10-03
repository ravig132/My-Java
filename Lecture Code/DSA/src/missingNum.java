public class missingNum {
    public static void main (String [] args ){
        int [] arr = {0,1,2,3,4,5,7};
        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int [] arr){
        int n = arr.length;
        int sum = (n*(n+1))/2 ;
        int sumArr = 0 ;

        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }

        return sum-sumArr ;
    }

}
