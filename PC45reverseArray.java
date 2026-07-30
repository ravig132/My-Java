public class PC45reverseArray {
    public static void main (String [] args){
        System.out.println("WELCOME TO THE ARRAY REVERSE STATION");
        int[] array = arrayUtility.inputArray();
        int size = array.length;
        int[] Arr = reverseArray(array,size);


        arrayUtility.displayArr(Arr);

    }
    public static int[] reverseArray(int[] array , int size){
        int[] newArr = new int[size];
        int i = 0 ,j= size-1 ;
        while (i< array.length){
            newArr[j]=array[i];
            j--;
            i++;
        }
        return newArr ;
    }
}
