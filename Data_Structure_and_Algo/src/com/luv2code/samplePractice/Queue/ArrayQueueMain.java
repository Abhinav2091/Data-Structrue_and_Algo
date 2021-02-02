package com.luv2code.samplePractice.Queue;

import com.luv2code.samplePractice.lists.Employee;

public class ArrayQueueMain {

    public static void main(String ar[])
    {
        Employee Abhinav=new Employee("Abhinav", "Sharma", 1);
        Employee Abhi=new Employee("Abhi", "Kumar", 13);
        Employee Himanshu=new Employee("Himanshu", "Tiwari", 1456);
        Employee Sid=new Employee("Sid", "Singh", 10000);

        ArrayQueue queue =new ArrayQueue(10);
        //will throw exception as there is no element in peek
        //System.out.println(queue.peek());
        queue.add(Abhinav);
        queue.add(Abhi);
        queue.add(Himanshu);
        queue.add(Sid);
        queue.printQueue();
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.remove();
        queue.printQueue();
        System.out.println(queue.size());

    }
}
