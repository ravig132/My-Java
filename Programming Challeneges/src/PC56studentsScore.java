import java.util.Scanner;

public class PC56studentsScore {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE PERFORMANCE TELLER");
        int Score = performance();
        String performance = Score > 80 ? "High" : Score < 80 && Score > 50 ? "Moderate" : "Low" ;
        System.out.println("Students performance is "+performance);
    }
    public static int performance(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks of Hindi : ");
        int hindi = input.nextInt();
        System.out.print("Enter the marks of English : ");
        int english = input.nextInt();
        System.out.print("Enter the marks of Maths : ");
        int maths = input.nextInt();
        System.out.print("Enter the marks of Science : ");
        int science = input.nextInt();
        System.out.print("Enter the marks of SST : ");
        int sst = input.nextInt();
        return (hindi + english + maths + science + sst)/5 ;
    }
}
