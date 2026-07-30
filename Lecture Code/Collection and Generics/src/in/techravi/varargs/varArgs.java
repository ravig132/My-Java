package in.techravi.varargs;

public class varArgs {
    public static void main (String [] args ){
       long sum = sum(2,4,4,5,5,6,6);
        System.out.println("The sum of the numbers are : "+sum);
    }
    public static long sum (int ... a ){
        long sum = 0 ;
        for (int i : a) {
            sum += i ;
        }
        return  sum;
    }
}
