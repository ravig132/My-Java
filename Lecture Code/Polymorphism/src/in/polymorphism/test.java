package in.polymorphism;

public class test {
    public static  void main ( String [] args ){
        car c = new car(4);
        vehicle v = new car(4);
       // vehicle veh = new vehicle();
        plane p = new plane() ;
        //car vCar = (car) new vehicle() ;
        //castTest(v);
        castTest(c);
        castTest(p);
//        c.start();
//        p.start();
    }
    private static  void castTest (vehicle veh){
       /* car vCar = (car) veh ;
        ((car) veh).noOfDoors() ;*/
        veh.start();
        //vCar.noOfDoors() ;

    }
}
