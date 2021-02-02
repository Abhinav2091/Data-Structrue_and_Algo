package com.luv2code.samplePractice.Queue;

import com.luv2code.samplePractice.lists.Employee;

public class CircularQueueMain {

    public static void main(String ar[])
    {
        Employee Abhinav=new Employee("Abhinav", "Sharma", 1);
        Employee Abhi=new Employee("Abhi", "Kumar", 13);
        Employee Himanshu=new Employee("Himanshu", "Tiwari", 1456);
        Employee Sid=new Employee("Sid", "Singh", 10000);

        CircularQueue queue =new CircularQueue(5);
        //will throw exception as there is no element in peek
        //System.out.println(queue.peek());
        queue.add(Abhinav);
        queue.remove();
        queue.add(Abhi);
        queue.remove();
        queue.add(Himanshu);
        queue.remove();
        queue.add(Sid);
        queue.remove();
        queue.add(Sid);
        queue.remove();
        queue.add(Abhi);
        queue.printQueue();
        System.out.println(queue.size());
        //as we can see we are not increasing the array size unless its all block are occupied
        //else it will work as usual.


    }
}
