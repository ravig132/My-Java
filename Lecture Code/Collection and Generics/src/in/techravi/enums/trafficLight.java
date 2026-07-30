package in.techravi.enums;

public enum trafficLight {
    RED("Stop"),GREEN("Go"),YELLOW("Caution") ;
    private String action ;

    trafficLight (String action ){
        this.action = action ;
    }

    public String getAction(){
        return action ;
    }

}
