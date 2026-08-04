import java.util.Scanner;

public class UserInput {
    public static void main(String[]args0){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = input.nextLine();
        System.out.println("Good Morning "+name);
        System.out.println(name+ " ,Also tell me your age");
        int age =input.nextInt();
        System.out.println(name+ " , your age is " +age);

    }
}