package in.ravi.multithreading.synchronize;

public class counter {
    private int count = 0 ;

    public synchronized void increment (){
        count++ ;
    }


    public int getCount(){
        return count;
    }

}
