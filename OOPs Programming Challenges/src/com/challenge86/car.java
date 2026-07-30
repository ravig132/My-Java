package com.challenge86;

public class car extends vehicle {
    @Override
    public void service (){
        System.out.println("Car is Servicing");
    }


    public car(int noOfTyre , String color , String Model , double FuelLevel){
        super.noOfTyre = noOfTyre ;
        super.color = color ;
        super.Model = Model ;
        super.FuelLevel = FuelLevel ;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("car{");
        sb.append("noOfTyre=").append(noOfTyre);
        sb.append(", color='").append(color).append('\'');
        sb.append(", Model='").append(Model).append('\'');
        sb.append(", FuelLevel=").append(FuelLevel);
        sb.append('}');
        return sb.toString();
    }
}
