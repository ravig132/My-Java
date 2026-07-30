public class patternILU {
    public static void main (String [] args){
        int num = 5 ;
        // loop for I
        int a = 1 ;
        while(a<=num) {
            int b = 1;
            while (b <= num) {
                if (a == 1 || b == 3 || a == 5) {
                    System.out.print(" #");
                } else {
                    System.out.print("  ");
                }
                b++;
            }
            System.out.println();
            a++;
        }
        System.out.println();
        // loop for L
        int c = 1 ;
        while ( c<=num ){
            int d = 1;
            while(d<=num){
                if (d==1 || c==5){
                    System.out.print(" #");
                }else {
                    System.out.print("  ");
                }
                d++ ;
            }
            System.out.println();
            c++;
        }
        System.out.println();
        // loop for O
        int e = 1 ;
        while(e<=num){
            int f = 1 ;
            while(f<=num){
                if (e==1 || f==1 || e==5 || f==5){
                    System.out.print(" #");
                }else {
                    System.out.print("  ");
                }
                f++;
            }
            System.out.println();
            e++;
        }
        System.out.println();
        // loop for V
        int g = 1 ;
        while ( g<=num ){
            int h = 1;
            while(h<=(num+4)){
                if (g==h || g+h == 10 ){
                    System.out.print(" #");
                }else {
                    System.out.print("  ");
                }
                h++ ;
            }
            System.out.println();
            g++;
        }
        System.out.println();
        // loop for E
        int i = 1 ;
        while ( i<=num ){
            int j = 1;
            while(j<=num){
                if (i==1 || i==3 || i==5 || j==1){
                    System.out.print(" #");
                }else {
                    System.out.print("  ");
                }
                j++ ;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        // loop for U
        int k = 1 ;
        while ( k<=num ){
            int l = 1;
            while(l<=num){
                if (l==1 || k==5 || l==5){
                    System.out.print(" #");
                }else {
                    System.out.print("  ");
                }
                l++ ;
            }
            System.out.println();
            k++;
        }
    }

}
