public class uniqueElement {
    public static void main (String [] args ){
        int [] arr = {1,2,3,4,4,1,2,5,3};
        System.out.println(uniqueElementXOR(arr));
    }
    public static int uniqueElementXOR(int [] arr){
        int unique  =  0 ;
        for (int i : arr) {
            unique ^= i ;
        }

        return  unique ;
    }

}
