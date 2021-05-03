package com.arsatapathy.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < 5; i ++){
            pq.add(i);
        }

        System.out.println(pq);

        pq.add(-1);

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
