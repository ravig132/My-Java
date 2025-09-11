import java.util.Scanner;

public class PC14fahToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Fahrenheit  scale : ");
        float F = input.nextFloat();
        float C = (F-32)*5/9;
        System.out.print("The value of Fahrenheit scale in Celsius scale is : "+ C);

    }
}
