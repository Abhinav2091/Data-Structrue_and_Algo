package com.luv2code.samplePractice.Queue;

import com.luv2code.samplePractice.lists.Employee;

import java.util.NoSuchElementException;

public class CircularQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public CircularQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        //check if the queue size is more than last element mean the previous block of array is empty
        //so we will use circular queue
        //so we don't need to resize the array
        if (size() == queue.length - 1) {
            int numIteams = size();
            Employee[] newArray = new Employee[2 * queue.length];
            //copy from front to the last element of array t
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            //copy the remaining values above front
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            queue = newArray;
            //after it is done set front and back value
            front = 0;
            back = numIteams;
        }
        queue[back] = employee;
        if (back < queue.length - 1)
            back++;
            //so it will enter here in case of empty block
        else back = 0;
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
        //wrap back to zero after it reaches he end in case of circular queue.
        else if (front == queue.length) {
            front = 0;
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
        //if front is smaller the queue is not wrapped
        if (front <= back)
            return back - front;
            //else we gonna get -ve value so we need to add lent to get the actual size of queue
        else
            return back - front + queue.length;
    }

    public void printQueue() {
        //so for printing we do check like size
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        //else we ll print it two portion
        else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
