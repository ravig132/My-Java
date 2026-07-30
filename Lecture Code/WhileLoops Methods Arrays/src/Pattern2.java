public class Pattern2 {
    public static void main ( String [] args){
        int num = 5 ;
//        int i = 1 ;
//        while(i<=num) {
//            int j = 1 ;
//            while(j<=num){
//                if (i==1 || j==3){
//                    System.out.print(" *");
//                }else {
//                    System.out.print("  ");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        pattern(num);

    }
    public static void pattern(int num){
        int i = 1;
        while(i<=num){
            int j = 1 ;
            while(j<=num){
                if (i+j == num+1){
                    System.out.print(" @");
                }else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
