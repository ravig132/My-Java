package com.challenge103;

public class printTask implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ",i);
        }
        System.out.printf("%s",Thread.currentThread().getName());
        System.out.println();
    }
}
