package com.challenge94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main (String [] args ){
        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });
        queue.offer(new student("Ravi",'C'));
        queue.offer(new student("Prashant",'A'));
        queue.offer(new student("Bobby", 'B'));
        queue.offer(new student("Ram", 'A'));
        queue.offer(new student("Syam", 'C'));
        queue.offer(new student("Meera", 'D'));


        System.out.printf("Queue is: %s\n",queue);
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());



    }


}
