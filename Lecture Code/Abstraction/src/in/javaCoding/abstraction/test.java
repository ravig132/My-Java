package in.javaCoding.abstraction;

public class test {
    public static  void main ( String [] args){
        // showing error because humne vehicle ko abstract class banaya hai
        // Vehicle veh = new Vehicle(2);
        Car car = new Car();

        int noOfTyres = car.getNoOfTyres();
        car.commute();
        System.out.println(noOfTyres);
        car.makeStartSound();
    }
}
