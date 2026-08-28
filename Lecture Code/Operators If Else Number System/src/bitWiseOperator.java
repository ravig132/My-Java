public class bitWiseOperator {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 6 ;

        System.out.println(a&b);

        System.out.println(a|b);

        System.out.println(a^b);

        System.out.println(~a);

        int n = 1 ;
        for (int i = 0; i < 34; i++) {
            n = n<<1 ;
            System.out.println(n);

        }
    }
}
