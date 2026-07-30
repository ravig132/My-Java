package in.polymorphism;

public class car  extends vehicle{
    car(int noOfTyres){
        super(noOfTyres);
    }

    @Override
    public void start (){
        System.out.println(super.getNoOfTyres());
        System.out.println("Car is Starting");
    }
    public int noOfDoors (){
        return 4 ;
    }
}
