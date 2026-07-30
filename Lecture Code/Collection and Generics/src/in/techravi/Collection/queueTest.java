package in.techravi.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueTest {
    public static  void main (String [] args ){
        Queue<String> strQueue = new LinkedList<>();
        strQueue.offer("Ravi");
        strQueue.offer("Bobby");
        strQueue.offer("Gyanwati");
        strQueue.offer("Sompal");
        strQueue.offer("Aditya");

        strQueue.poll();
        strQueue.poll();
        strQueue.poll();
        strQueue.poll();
        strQueue.add("Gangwar");
        strQueue.add("Baranawal");


        for (String string : strQueue) {
            System.out.println(string);
        }


    }
}
