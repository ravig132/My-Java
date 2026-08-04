import java.util.Scanner;

public class PC54evenOrOdd {
    public static void main ( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE EVEN OR ODD CHECKER");
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        PC54evenOrOdd NumCheck = new PC54evenOrOdd();
        boolean evenOrOdd = NumCheck.evenOrOdd(num);
        if (evenOrOdd){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
    public boolean evenOrOdd(int num){
        return num%2 == 0 ? true : false ;
    }
}
