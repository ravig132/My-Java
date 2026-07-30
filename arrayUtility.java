import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of array size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int index = 0 ;
        while(index<arr.length){
            System.out.print("Enter the Value of element "+(index+1)+": ");
            arr[index] = input.nextInt();
            index++;
        }
        return arr ;
    }
    public static void displayArr(int[] array){
        int i = 0 ;
        while(i< array.length){
            System.out.print(array[i]+" ");
            i++;
        }
    }
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the value of Columns : ");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];

        int i = 0;
        while (i < rows){
            int j = 0 ;
            while (j < cols){
                System.out.print("The value of "+(i+1)+" rows and "+(j+1)+" column is : ");
                array[i][j] = input.nextInt();
                j++;
            }
            i++;
        }


        return array;
    }
}
