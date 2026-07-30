public class car {

    // instance Variable

    int noOfWheel ;

    String colour ;

    float maxSpeed ;

    float currentFuelInLiters ;

    int noOfSeats ;
    // constructor


    car(String colour){
        this.colour = colour;
        noOfWheel = 4;
        maxSpeed = 120;
        noOfSeats = 6 ;
        currentFuelInLiters = 2;
    }

    // instance Methods
    public car Start (){
        if (currentFuelInLiters==0){
            System.out.println("Car is out of Fuel,cannot start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is at reserved mode , please refuel");
        }else {
            System.out.println("Car is started bruhhh...");
        }
        return this ;
    }

    public void drive (){

            System.out.println("Car is Driving");
            currentFuelInLiters--;
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters  += currentFuelInLiters ;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
