package com.luv2code.samplePractice.HashTables;

import com.luv2code.samplePractice.lists.Employee;

public class LinearProbingHashTableMain {

    public static void main(String ar[])
    {
        Employee Abhinav=new Employee("Abhinav", "Sharma", 1);
        Employee Abhi=new Employee("Abhi", "Kumar", 13);
        Employee Himanshu=new Employee("Himanshu", "Tiwari", 1456);
        Employee Sid=new Employee("Sid", "Singh", 10000);
        Employee Aju=new Employee("Aju", "Sri", 11110000);

        LinearProbingHashTable linearProbingHashTable =new LinearProbingHashTable();
        linearProbingHashTable.put("Abhinav",Abhinav);
        linearProbingHashTable.put("Abhi",Abhi);
        linearProbingHashTable.put("Himanshu",Himanshu);
        linearProbingHashTable.put("Sid",Sid);
        linearProbingHashTable.put("Aju",Aju);
        linearProbingHashTable.printHashTable();

        System.out.println("******************************");


        System.out.println(linearProbingHashTable.remove("Sid"));

        linearProbingHashTable.printHashTable();
        System.out.println(linearProbingHashTable.get("Aju"));



    }
}
