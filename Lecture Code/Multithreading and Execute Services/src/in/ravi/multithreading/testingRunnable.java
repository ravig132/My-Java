package in.ravi.multithreading;

import in.ravi.multithreading.runnable.printTask;

public class testingRunnable {
    public static void main (String [] args ){

        long startTime = System.currentTimeMillis();

        printTask p1 = new printTask('*');
        printTask p2 = new printTask('#');
        printTask p3 = new printTask('$');

        Thread t1 = new Thread(p1);
        t1.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(p2);
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        Thread t3 = new Thread(p3);
        t3.start();
        t3.setPriority(Thread.NORM_PRIORITY);

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total execution time: %d ms\n",
                Thread.currentThread().getName(), endTime - startTime);

    }
}
