package com.challenge102;

public class trafficLight extends Thread{

    private final trafficColour signal;

    public trafficLight(trafficColour signal) {
        this.signal = signal;
    }

    public synchronized void Signal() {
        System.out.printf("The Signal is %s \n ",signal);
        try {
            Thread.sleep(signal.getTimeInMilliSec());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("The Signal %s is Inactive\n",signal);
    }

    @Override
    public void run() {
        Signal();
    }
}
