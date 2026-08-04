public class PC47mergingSortedArrays {
    public static void main (String [] args ){
        System.out.println("WELCOME TO THE SORTED ARRAY MERGING");
        int[] arr1 = arrayUtility.inputArray();
        int[] arr2 = arrayUtility.inputArray();
        int[] mergeArr = merge(arr1,arr2);
        System.out.println("Your merged array is : ");
        arrayUtility.displayArr(mergeArr);
    }
    public static int[] merge(int[] arr1 , int[] arr2){
        int size = arr1.length + arr2.length;
        int[] newArr = new int[size];
        int i = 0, j = 0, k = 0;
        while(i< arr1.length || j < arr2.length){
            if (j== arr2.length ||
                    (i< arr1.length && arr1[i]<arr2[j])){
                newArr[k] = arr1[i];
                i++;
            }else {
                newArr[k]=arr2[j];
                j++;
            }
            k++;
        }

        return newArr ;
    }
}
