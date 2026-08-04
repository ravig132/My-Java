package in.ravi.executorServices.future;

import java.util.concurrent.*;

public class testingFutures {
    public static void main (String [] args ) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(2);
        fetchName task1  = new fetchName("Ravi");
        fetchName task2  = new fetchName("Bobby");
        fetchName task3  = new fetchName("Gyanwati");
        fetchName task4  = new fetchName("Sompal");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\n Full name is : %s", name1.get());
        System.out.printf("\n Full name is : %s", name2.get());
        System.out.printf("\n Full name is : %s", name3.get());
        System.out.printf("\n Full name is : %s", name4.get());


        service.shutdown();
    }
}
