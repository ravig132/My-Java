public class PC43sortedORnot {
    public static void main (String []args){
        System.out.println("WELCOME TO THE SORTED ARRAY CHECKER");
        int[] array = arrayUtility.inputArray();
        boolean isInc = isIncreasing(array);
        boolean isDec = isDecreasing(array);
        if (isDec || isInc){
            System.out.println("Array Is Sorted");
        }else {
            System.out.println("Array is not Sorted");
        }
    }
    public static boolean isIncreasing(int[]array){
        int i = 1;
        while(i< array.length){
            if (array[i]<array[i-1]){
                return false ;
            }
            i++;
        }
        return true ;
    }
    public static boolean isDecreasing(int[] array){
        int i = 1;
        while(i< array.length){
            if (array[i]>array[i-1]){
                return false ;
            }
            i++;
        }
        return true ;
    }
}
