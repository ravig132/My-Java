import java.util.Scanner;

public class powerOfTwo {
    public static  void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
//        //brute force method
//        int count =  0 ;
//        while(num!=0){
//            if ((num&1)!=0){
//                count++;
//            }
//            num = num>>1 ;
//        }
//
//        System.out.println("Total set bits are : "+count);
//        if (count==1){
//            System.out.println("Power of two");
//        }else {
//            System.out.println("Not power of two");
//        }


        //optimized method


        if ((num&(num-1))==0){
            System.out.println("Number is power of two");
        }else {
            System.out.println("Number is not power of two");
        }
    }
}
