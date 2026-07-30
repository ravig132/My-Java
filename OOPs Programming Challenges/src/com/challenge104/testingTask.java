package com.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class testingTask {
    public static void main (String [] args ) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        task task1 = new task("Ravi");
        task task2 = new task("Bobby");
        task task3 = new task("Gyanwati");
        task task4 = new task("Sompal");

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.submit(task4);

        executor.shutdown();


        if (!executor.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.printf("something went terribly wrong");
            executor.shutdownNow();
        }
    }
}
