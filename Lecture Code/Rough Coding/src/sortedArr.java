public class sortedArr {
    public static int[] DObubbleSort(int[] arr , int noOfElements, int[] coWeight){
        int thirdVAr ;
        int Var ;
        for (int i = 0; i < noOfElements-1; i++) {
            for (int j = 0; j < noOfElements-i-1; j++) {
                if (arr[j] <= arr[j+1]){
                    thirdVAr = arr[j] ;
                    Var = coWeight[j];
                    arr[j] = arr[j+1] ;
                    coWeight[j] = coWeight[j+1];
                    arr[j+1] = thirdVAr ;
                    coWeight[j+1] = Var ;
                }
            }

        }
        return coWeight ;
    }
}
