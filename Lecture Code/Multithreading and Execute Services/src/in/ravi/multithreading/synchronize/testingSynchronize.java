package in.ravi.multithreading.synchronize;


public class testingSynchronize {
    public static void main(String [] args ){
        long startTime = System.currentTimeMillis();
        counter Counter = new counter();
        updater t1 = new updater(Counter);
        updater t2 = new updater(Counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted"+e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Final value is %d and "+"time taken : %d",Counter.getCount(),(endTime - startTime));
    }
}
