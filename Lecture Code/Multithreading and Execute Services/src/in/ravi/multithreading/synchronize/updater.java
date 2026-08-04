package in.ravi.multithreading.synchronize;


public class updater extends Thread {
    private final counter Counter;


    public updater(counter Counter) {
        this.Counter = Counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            Counter.increment();
        }
    }
}
