import java.util.Scanner;

public class PC28multiplicationTable {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME  TO TABLE PRINTER");
        System.out.print("Enter the number whose table you want : ");
        int Num = input.nextInt();
        Table(Num);

    }
    public static void Table(int Num){

        int i = 1;
        while(i<=10){
            System.out.println(Num+ " * " +i+ " = "+(Num*i));
            i++;
        }

    }
}
