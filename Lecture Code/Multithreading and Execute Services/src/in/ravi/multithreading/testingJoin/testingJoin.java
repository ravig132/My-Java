package in.ravi.multithreading.testingJoin;

import in.ravi.multithreading.runnable.printTask;

public class testingJoin  {
    public static void main (String [] args ) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        printTask p1 = new printTask('*');
        printTask p2 = new printTask('#');
        printTask p3 = new printTask('$');

        Thread t1 = new Thread(p1);
        t1.start();
        t1.join();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total execution time: %d ms\n",
                Thread.currentThread().getName(), endTime - startTime);

    }
}
