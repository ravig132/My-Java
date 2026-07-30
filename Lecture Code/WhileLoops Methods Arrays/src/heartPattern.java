public class heartPattern {
    public static void main(String[] args) {
        int num = 5 ;
        int i = 1 ;
        while(i<=num-3){
            int j = 1 ;
            while (j<=num+4){
                if (i==2&&j==2 || i==1&&j==3 || i==1&&j==4 || i==2&&j==5 || i==1&&j==6 || i==1&&j==7 || i==2&&j==8){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++ ;
        }
        int a = 1 ;
        while(a<=num){
            int b = 1 ;
            while(b<=num+4){
                if (a==b || a+b == 10){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
