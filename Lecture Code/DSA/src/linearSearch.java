public class linearSearch {
    public static void main (String [] args ){
        int[] arr = {1,2,4,3,6,5,7} ;
        int x = 3;
        searching(arr,x);

    }
    public static void searching(int[] arr , int num){
        int index = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                index = i ;
            }
        }
        if (index > -1){
            System.out.println("Element is found in "+index+" index");
        }else {
            System.out.println("Element is not found !");
        }
    }

}
