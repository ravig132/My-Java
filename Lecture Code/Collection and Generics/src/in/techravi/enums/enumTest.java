package in.techravi.enums;

public class enumTest {
    public static  void main (String [] args){
        trafficLight color ;
        color = trafficLight.GREEN ;
        System.out.println(color);
        color = trafficLight.YELLOW ;
        System.out.println(color);
        grade Grade ;
        for (grade value : grade.values()) {
            System.out.println(value);
        }
    }
}
