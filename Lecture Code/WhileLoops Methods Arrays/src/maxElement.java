public class maxElement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,9,129,0,10,11,45,66,23,70,12};
        int max = arr[0] ;
        for (int i=0; i<=arr.length-1;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Max element is "+max);
    }
}
