package com.luv2code.samplePractice.HashTables;

import com.luv2code.samplePractice.lists.Employee;

public class ChanedHashTableMain {

    public static void main(String ar[])

    {
        Employee Abhinav=new Employee("Abhinav", "Sharma", 1);
        Employee Abhi=new Employee("Abhi", "Kumar", 13);
        Employee Himanshu=new Employee("Himanshu", "Tiwari", 1456);
        Employee Sid=new Employee("Sid", "Singh", 10000);
        Employee Aju=new Employee("Aju", "Sri", 11110000);

        ChainedHashTable chainedHashTable =new ChainedHashTable();
        chainedHashTable.put("Abhinav",Abhinav);
        chainedHashTable.put("Abhi",Abhi);
        chainedHashTable.put("Himanshu",Himanshu);
        chainedHashTable.put("Sid",Sid);
        chainedHashTable.put("Aju",Aju);

        chainedHashTable.printHashTable();

        System.out.println("*********************");
        System.out.println(chainedHashTable.get("Sid"));
        System.out.println("*********************");
        System.out.println(chainedHashTable.remove("Abhinav"));
        System.out.println(chainedHashTable.remove("Aju"));
        System.out.println("*********************");
        chainedHashTable.printHashTable();
    }
}
