import java.util.Scanner;

public class PC72areaAndCircum {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE AREA AND CIRCUMFERENCE OF THE CIRCLE");
        System.out.print("Enter the radius of the circle : ");
        int radius = input.nextInt();
        double area = Math.PI * Math.pow(radius,2);
        double circumference = 2*Math.PI*radius ;

        System.out.printf("The Area of the circle is : %f \n",area);
        System.out.printf("The Circumference of the circle is : %f",circumference);


    }

}
