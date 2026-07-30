package com.challenge103;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testingSingleExecutor {
    public static  void main (String [] args ) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        printTask task1 = new printTask();
        printTask task2 = new printTask();

        service.submit(task1);
        service.submit(task2);
        service.shutdown();
    }
}
