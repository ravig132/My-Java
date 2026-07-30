import java.util.Scanner;

public class PC11areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Base of the Triangle : ");
        int Base = input.nextInt();
        System.out.print("Enter the value of Height of the Triangle : ");
        int Height =input.nextInt();
        int Area = ( Base * Height )/2;

        System.out.println("The Area of the Triangle is : " +Area);
    }
}
