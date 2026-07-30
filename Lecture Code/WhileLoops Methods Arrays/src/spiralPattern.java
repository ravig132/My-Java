public class spiralPattern {
    public static void main (String [] args){
        int num = 5 ;
        int i = 1 ;
        while (i <= num){
            int j = 1 ;
            while (j<=i){
                if (i==1 || j==5 ||i==5 || j==1){
                    System.out.print(" *");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
