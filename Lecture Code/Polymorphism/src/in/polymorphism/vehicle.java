package in.polymorphism;

public abstract class vehicle {
    vehicle(){
        this.noOfTyres = 0 ;
    }
    vehicle (int noOfTyres ){
        this.noOfTyres = noOfTyres ;
    }

    public int getNoOfTyres (){
        return this.noOfTyres ;
    }

    private int noOfTyres ;
    public  void start (){
        System.out.println("Vehicle is Starting");
    } ;
}
