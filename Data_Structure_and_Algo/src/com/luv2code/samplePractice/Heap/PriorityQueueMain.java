package com.luv2code.samplePractice.Heap;

import java.util.PriorityQueue;

//Priority is Min heap
public class PriorityQueueMain {
    public static void main(String ar[]) {
        PriorityQueue<Integer> pq = new PriorityQueue();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(25);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

        System.out.println(pq.peek());
        //remove the root.
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        //remove and poll is also an alternative of remove
        System.out.println(pq.remove(54));
        pq.add(-23);
        System.out.println(pq.peek());
        Object[] ints =pq.toArray();
        for(Object num:ints)
        {
            System.out.print(num+",");
        }


    }
}
