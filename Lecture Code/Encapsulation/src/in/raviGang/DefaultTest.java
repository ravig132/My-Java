package in.raviGang;

import in.Ravi.Car;

public class DefaultTest {
    public static void main ( String [] args ){
        Car car = new Car("Yellow","Dezire",2,5000);
        // can't access car.costOfPurchase due to default access modifier
        System.out.println(car);
    }
}
