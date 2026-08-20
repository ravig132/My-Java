package in.techravi.collectionNew;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class ArrayDeque{
    public static void main(String[] args) {
        Deque<Integer> q = new java.util.ArrayDeque<>();

        q.offer(10);
        q.offerFirst(1);
        q.offerLast(100);

        System.out.println(q);

        q.pollFirst();

        System.out.println(q);

        q.pollLast();

        System.out.println(q);

        q.peekFirst();

        System.out.println(q);
        q.offerFirst(10);
        q.offer(90);
        q.offerLast(100) ;
        System.out.println(q.peekLast());

        System.out.println(q.peekFirst());

        System.out.println(q);

        System.out.println(q.size());



    }


}

class  priorityQueue{
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(78);
        pq.offer(34);
        pq.offer(50);
        pq.offer(90);


        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}

public class queueCollection {
    public static void main (String [] args ){

        Queue<Integer> q = new LinkedList<>();
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        System.out.println("Polling : "+q.poll());

        System.out.println("Peeking : "+q.peek());

        

    }
}
