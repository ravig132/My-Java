package com.challenge101;

public class threadJoin extends Thread{

    private final int Num ;

    public threadJoin(int Num ){
        this.Num = Num;
    }

    @Override
    public void run() {
        System.out.printf("thread %d started \n",Num);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("thread %d Ended \n",Num);

    }
}
