package in.ravi.multithreading.threadClass;

public class needOfMultithreading {
    public static void main (String [] args){

        long startTime = System.currentTimeMillis();


        for (int i = 1; i < 100 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n* task completed");
        for (int i = 1; i < 100 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.print("\n# task completed\n");
        for (int i = 1; i < 100 ; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n$ task completed");


        long endTime = System.currentTimeMillis();

        System.out.printf("Total execution time: %d ms\n",(endTime - startTime));
    }
}
