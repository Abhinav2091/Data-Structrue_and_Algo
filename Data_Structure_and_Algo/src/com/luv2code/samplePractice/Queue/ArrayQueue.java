package com.luv2code.samplePractice.Queue;

import com.luv2code.samplePractice.lists.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        //check if the queue is full increment it.
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        //if queue is empty
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        //optimization if size is zero reset front and back to 0 else front and back will be incremented value
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek() {
        //if queue is empty
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];

    }

    public int size() {
        //we can get queue by subtracting back from front
        return back - front;
    }

    public void printQueue()
    {
   for(int i=front;i<back;i++)
   {
       System.out.println(queue[i]);
   }
    }

}
