package in.Ravi;

import in.GetterSetter.Car;

public class GetterTest {
    public static void main ( String [] args ){
        Car car = new Car("Red","Maruti",4,70000);
        System.out.printf("%s %s", car.getColor(),car.getModel());
    }
}
