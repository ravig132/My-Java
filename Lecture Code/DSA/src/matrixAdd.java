import java.util.Scanner;

public class matrixAdd {
    public static void main (String [] args ){
        int[][] a = {{1,2,2},{3,4,5}};
        int[][] b = {{9,5,7},{1,2,1}};
        int row = a.length ;
        int col = a[0].length;


        int[][] result = new int[row][col] ;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = a[i][j] + b[i][j] ;
            }
        }

        System.out.println("Matrix after addition : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j]+"   ");
            }
            System.out.println();
        }

    }
}
