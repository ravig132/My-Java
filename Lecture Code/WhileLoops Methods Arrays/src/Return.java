import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Greet();
        int First = readNumber();
        int Second =readNumber();


        int sum = First + Second;
        System.out.println(sum);

    }
    public static void Greet(){
        System.out.println("Welcome to Calculator");
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int  Number = input.nextInt();
        return Number ;

    }
}

