import java.util.Scanner;

public class SortedCheck {
//    String Name = "Ravi Kumar Gangwar" ;
//    int age = 18 ;
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("studentClass{");
//        sb.append("Name='").append(Name).append('\'');
//        sb.append(", age=").append(age);
//        sb.append('}');
//        return sb.toString();
public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the capacity of array : ");
    int n = input.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = input.nextInt();
    }
    int[] Arr = DObubbleSort(arr,n);
    for (int j = 0; j < n; j++) {
        System.out.print(Arr[j] + " ,");
    }

    }
    public static int[] DObubbleSort(int[] arr , int noOfElements){
        int thirdVAr ;
        for (int i = 0; i < noOfElements-1; i++) {
            for (int j = 0; j < noOfElements-i-1; j++) {
                if (arr[j] <= arr[j+1]){
                    thirdVAr = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] =thirdVAr ;
                }
            }

        }
        return arr ;
    }
}
