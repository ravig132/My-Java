public class twoDArray {
    public static void main(String [] args ){
        int [][] Arr = {{1,2,3},{4,5,6},{7,8,9}};
        int i=0 ;
        while(i<Arr.length){
            int j=0 ;
            while (j<Arr[i].length){
                System.out.print(Arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
