package in.passBy;

public class testPassByValue {
    public static void main (String [] args ){
        int x = 5 ;
        int y = 6 ;
        int sum = add(x,y);
        System.out.printf("x=%d y=%d sum=%d",x,y,sum);

    }

    public static int add ( int a, int b){
//        return a+b ;
        a+=b ;
        return a ;
    }
}
