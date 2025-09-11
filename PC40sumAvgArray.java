public class PC40sumAvgArray {
    public static void main (String [] args){
        int[] array = arrayUtility.inputArray();
        long sum = sumAvg(array);
        float Avg = (float) sum / array.length ;
        System.out.println("The sum of the numbers is : "+sum);
        System.out.println("The Average of the numbers is : "+Avg);

    }
    public static long sumAvg(int[] array){
        int sum = 0;
        int i = 0;
        while(i<array.length){
            sum += array[i];
            i++;
        }
        return sum ;
    }
}
