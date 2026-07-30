public class PC63arraySearchMaxNum {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE MAXIMUM NUMBER IN ARRAY SEARCHING");
        int[] arr = arrayUtility.inputArray();
        int max = Integer.MIN_VALUE ;
        for (int num : arr){
            if (max < num){
                max = num ;
            }
        }
        System.out.println("Maximum number is "+max);
    }
}

