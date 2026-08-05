import java.util.Scanner;

public class stringLec {
    public static void main (String [] args ){
//        Scanner input = new Scanner(System.in);
        String name  = "ana";

        char[] Name = name.toCharArray();

        for (int i = Name.length-1 ; i>=0; i--){
            System.out.print(Name[i]);
        }

    }
}
