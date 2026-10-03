public class missingNumUsingXor {

    public static void main (String [] args){
        int [] arr = {0,1,2,3,4,5,7};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int [] arr){

        int num = 0 ;

        int n = arr.length ;

        for (int i : arr) {
            num = (num ^ i) ^ n ;
            n-- ;

        }

        return num ;
    }
}
