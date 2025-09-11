public class PC42maxAndMin {
    public static void main(String []args){
        int[] array = arrayUtility.inputArray();
        if (array.length==0){
            System.out.println("Cannot Find Max and Min value ! \nbecause their is no Value in the Array !");
        }else {
        int max = max(array);
        int min = min(array);
        System.out.println("The maximum number of the array is : "+max);
        System.out.println("The minimum number of the array is : "+min);
        }

    }
    public static int max(int[] array){
        int max = array[0];
        int i= 1 ;
        while(i< array.length){
            if (max<array[i]){
                max = array[i];
            }
            i++ ;
        }

        return max ;
    }
    public static int min(int[] array){
        int min = Integer.MAX_VALUE ;
        int i = 0 ;
        while(i<array.length){
            if (min>array[i]){
                min = array[i];
            }
            i++;
        }
        return min ;
    }
}
