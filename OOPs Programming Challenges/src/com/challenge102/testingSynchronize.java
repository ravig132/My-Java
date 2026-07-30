package com.challenge102;

public class testingSynchronize {
    public static  void main (String [] args ) throws InterruptedException {
        trafficLight red = new trafficLight(trafficColour.RED);
        trafficLight green = new trafficLight(trafficColour.GREEN);
        trafficLight yellow = new trafficLight(trafficColour.YELLOW);

        red.start();
        red.join();
        green.start();
        green.join();
        yellow.start();
    }
}
