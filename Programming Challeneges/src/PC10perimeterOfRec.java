import java.util.Scanner;

public class PC10perimeterOfRec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of length : ");
        float length = input.nextFloat();
        System.out.print("Enter the value of breadth : ");
        float breadth = input.nextFloat();
        float Perimeter = 2*(length+breadth);
        System.out.print("The perimeter of rectangle is : "+Perimeter);
    }
}
