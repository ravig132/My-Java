package com.challenge100;

public class testingChallenge100 {
    public static void main (String [] args ) throws InterruptedException{
        threadState t1 = new threadState();
        System.out.printf("Create a thread %s\n", t1.getState());
        t1.start();
        t1.join();
        System.out.printf("Thread finished %s",t1.getState());
    }
}
