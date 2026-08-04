public class PC50sumOf2DiagonalElements {
    public static void main(String [] args ){
        System.out.println("WELCOME TO THE SUM OF TWO DIAGONAL ELEMENTS");
        int[][] array = arrayUtility.input2DArray();
        int Sum = SumOfDiagonals(array);
        System.out.println("Sum of diagonals of array is : "+Sum);
        

    }
    public static int SumOfDiagonals(int[][] array){
        int sum = 0 ;
        int i = 0 ;
        while (i < array.length){
            int j = 0;
            while(j < array.length){
                if (i==j || i+j == (array.length-1)){
                    sum += array[i][j];
                }
                j++;
            }
            i++;
        }
        return sum ;
    }
}
