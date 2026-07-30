package com.challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class testingFactorial {
    public static void main (String []args){


        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            List<Future<Integer>> list = new ArrayList<>() ;
            for (int i = 0; i < 10; i++) {
                factorialCalculator task = new factorialCalculator(i);
                service.submit(task);
                list.add(service.submit(task));
            }
            for (Future<Integer> integerFuture : list) {
                System.out.printf("The factorial is : %d \n",integerFuture.get());
            }

            service.shutdownNow() ;
            if (!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.printf("Something went wrong");
                service.shutdownNow();
            }

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
