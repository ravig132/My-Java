package in.ravi.multithreading.sleep;

public class testingSleep {
    public static void main(String [] args ) throws InterruptedException {
        System.out.println("before sleep");
        Thread.sleep(3000);
        System.out.println("after sleep");
    }
}
