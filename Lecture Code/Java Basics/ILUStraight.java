public class ILUStraight {
    public static void main ( String [] args) {
        int i = 1 ;
        while(i<=5){
            int j = 1 ;
            while(j<=39){
                if (j==6||j==12 || j==18 || j==28 || j==34){
                    System.out.print(" ");
                }
                //condition for I

                if (i==1&&j==1 || i==1&&j==2|| i==1&&j==3 ||i==1&&j==4 ||i==1&&j==5 || i==5&&j==1|| i==5&&j==2|| i==5&&j==3 ||i==5&&j==4 ||i==5&&j==5 || j==3 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                //condition for L

                if (j==7 || i==5&&j==8 || i==5&&j==9|| i==5&&j==10 ||i==5&&j==11){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                //condition for O

                if (i==1&&(j==14 || j==15 || j==16) || i==5&&(j==14 || j==15 || j==16) || j==13 || j==17){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                //condition for V

                if (i==1&&(j==19||j==27) || i==2&&(j==20 || j==26) || i==3&&(j==21||j==25) || i==4&&(j==22||j==24) || i==5&&j==23){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                //condition for E

                if (j==29 || (i==1 || i==3 || i==5)&&(j==30 || j==31 || j==32 || j==33)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                //condition for U

                if (j==35 || j==39 || i==5&&(j==36 || j==37 || j==38)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }


                j++;
            }
            System.out.println();
            System.out.println();
            i++;
        }
    }
}
