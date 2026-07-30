package com.challenge99;

public class printTask extends Thread {



    private final int threadNum ;

    public printTask(int threadNum) {
        this.threadNum = threadNum ;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Hello From Thread %d \n",threadNum);
        }
    }
}
