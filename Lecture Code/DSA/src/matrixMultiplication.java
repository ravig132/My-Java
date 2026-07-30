public class matrixMultiplication {
    public static  void main (String [] args){
        int[][] a = {{1,2,2},{3,4,5},{1,3,1}};
        int[][] b = {{9,5},{1,2},{4,5}};
         int matARow = a.length ;
         int matACol = a[0].length ;
        System.out.println("matrix a : "+matARow +" "+ matACol);

         int matBRow = b.length ;
         int matBCol = b[0].length ;
        System.out.println("matrix b : "+matBRow+" "+ matBCol);

        System.out.printf("matrix will be : %d*%d \n",matARow,matBCol);
         int[][] result = new int[matARow][matBCol];

         try {

             for (int i = 0; i < matARow; i++) {
                 for (int j = 0; j < matBCol; j++) {
                     for (int k = 0; k < matACol; k++) {
                         result[i][j] += a[i][k] * b[k][j];
                     }
                 }
             }
         }catch (Exception e){
             System.out.println(e.getMessage());
         }


        System.out.println("Matrix after multiplication : ");
        for (int i = 0; i < matARow; i++) {
            for (int j = 0; j < matBCol; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();

        }
    }

}
