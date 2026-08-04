public class PC49sumAndAvg2DArray {
    public static void main(String [] args){
        System.out.println("WELCOME TO THE SUM AND AVERAGE PROGRAM OF 2D ARRAY");
        int[][] array = arrayUtility.input2DArray();
        long Sum = sum(array);
        double Avg = Average(array);
        System.out.println("Sum of 2D Array is : "+Sum);
        System.out.println("Average of 2D Array is : "+Avg);


    }
    public static long sum(int[][] array){
        long sum = 0 ;
        int i = 0 ;
        while (i < array.length){
            int j = 0;
            while(j<array[i].length){
                sum += array[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double Average (int[][] array){
        if (array.length==0){
            return 0 ;
        }
        int rows = array.length;
        int cols = array[0].length;
        double size = rows * cols ;
        return sum(array) / size;
    }
}
