import java.util.Scanner;

public class jaggedArray {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][] ;
        for (int i = 0; i<3;i++) {
            System.out.printf("Enter the length of col %d : ",i);
            arr[i] = new int[input.nextInt()];
        }

        for (int i = 0;i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                System.out.print("Enter the element of the array : ");
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
