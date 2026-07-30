package com.challenge101;

public class testingJoin {
    public static  void main (String [] args ) throws InterruptedException {
        threadJoin t1 = new threadJoin(1);
        threadJoin t2 = new threadJoin(2);
        threadJoin t3 = new threadJoin(3);


        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
