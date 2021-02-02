package com.luv2code.samplePractice.HashTables;

import com.luv2code.samplePractice.lists.Employee;

public class SimpleHashTableMain {
    public static void main(String ar[])
    {
        Employee Abhinav=new Employee("Abhinav", "Sharma", 1);
        Employee Abhi=new Employee("Abhi", "Kumar", 13);
        Employee Himanshu=new Employee("Himanshu", "Tiwari", 1456);
        Employee Sid=new Employee("Sid", "Singh", 10000);

        SimpleHashTable simpleHashTable =new SimpleHashTable();
        simpleHashTable.put("Abhinav",Abhinav);
        simpleHashTable.put("Abhi",Abhi);
        simpleHashTable.put("Himanshu",Himanshu);
        simpleHashTable.put("Sid",Sid);
        simpleHashTable.put("Sid",Sid);

        System.out.println(simpleHashTable.get("Abhinav"));
        simpleHashTable.printHashTable();


    }
}
