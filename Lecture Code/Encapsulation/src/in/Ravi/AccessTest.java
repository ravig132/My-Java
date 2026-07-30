package in.Ravi;

public class AccessTest {
    public static void main( String [] args){
        Car car = new Car();
        car.color = "Black";
        car.model = "Thar";
        car.costOfPurchase = 6000;

        // can be use because default access modifier is in same package

        System.out.println(car);
        Car newCar = new Car("Red","Thar",5,5000);
        System.out.println(newCar);
        Default def = new Default();

    }
}
