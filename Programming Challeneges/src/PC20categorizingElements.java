import java.util.Scanner;

public class PC20categorizingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE CATEGORY CALCULATOR");
        System.out.print("Enter the Age of the person : ");
        int Age = input.nextInt();
        if (Age<13&&Age>0){
            System.out.println("You are Child");
        } else if (Age<20&&Age>=13) {
            System.out.println("You are Teen");
        } else if (Age<60&&Age>=20) {
            System.out.println("You are Adult");
        } else if (Age>=60) {
            System.out.println("You are Senior");
        }else {
            System.out.println("Error !");
        }
    }
}
