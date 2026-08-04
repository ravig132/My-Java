package in.ravi.multithreading.threadClass;

public class extendingThreadClass {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();

        firstTask t1 = new firstTask();
        secondTask t2 = new secondTask();
        thirdTask t3 = new thirdTask();

        System.out.printf("\nStarting First Thread");
        t1.start();
        System.out.printf("\nStarting Second Thread");
        t2.start();
        System.out.printf("\nStarting Third Thread");
        t3.start();



        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total execution time: %d ms\n",
                Thread.currentThread().getName(), endTime - startTime);
    }
}
