import java.awt.*;

public class driver {
    String name ;
    String dateOfLicence;

    public static void main (String [] args){
//        car myCar = new car() ;
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        System.out.println(myCar.currentFuelInLiters);
        car Swift = new car("Black");
//        Swift.addFuel(6);
//        Swift.Start().drive();
//        driver myDriver = new driver();
//        myDriver.dateOfLicence="16 oct 2024";
        Swift.Start().drive();
        Swift.addFuel(8);
        System.out.println(Swift.colour);
        Swift.Start().drive();
    }
}
