package com.challenge102;

public enum trafficColour {
    RED(9000), GREEN(3000), YELLOW(1000);

    private final int timeInMilliSec ;

    public int getTimeInMilliSec() {
        return timeInMilliSec;
    }


    trafficColour(int timeInMilliSec) {
        this.timeInMilliSec = timeInMilliSec ;
    }
}
