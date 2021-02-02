package com.luv2code.samplePractice.HashTables;

import com.luv2code.samplePractice.lists.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployeeForLinearProbingRetrieval>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<StoredEmployeeForLinearProbingRetrieval>();
        }
    }

    private int hashKey(String key) {

        return Math.abs(key.hashCode() %hashTable.length);

    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        //add method of link list will add value in it
        hashTable[hashedKey].add(new StoredEmployeeForLinearProbingRetrieval(key, employee));

    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        //search the link list for the hash key for stored employee
        ListIterator<StoredEmployeeForLinearProbingRetrieval> iterator = hashTable[hashedKey].listIterator();
        StoredEmployeeForLinearProbingRetrieval employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.rawKey.equals(key)) {
                return employee.employee;
            }
        }
        //if no values were found
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        //set -1 so when we increment it we will be start from 0
        int linkedListindex = -1;
        //search the link list for the hash key for stored employee
        ListIterator<StoredEmployeeForLinearProbingRetrieval> iterator = hashTable[hashedKey].listIterator();
        StoredEmployeeForLinearProbingRetrieval storedEmployeeForLinearProbingRetrieval = null;
        while (iterator.hasNext()) {
            storedEmployeeForLinearProbingRetrieval = iterator.next();
            linkedListindex++;
            if (storedEmployeeForLinearProbingRetrieval.rawKey.equals(key)) {
                break;
            }
        }
        if (storedEmployeeForLinearProbingRetrieval == null)
            return null;
        else {
            hashTable[hashedKey].remove(linkedListindex);
            return storedEmployeeForLinearProbingRetrieval.employee;

        }



    }
    public void printHashTable()
    {
        for(int i=0;i<hashTable.length;i++)
        {
            if(hashTable[i].isEmpty())
                System.out.println(i+": Empty");
            else
            {

                ListIterator<StoredEmployeeForLinearProbingRetrieval> iterator = hashTable[i].listIterator();
                while(iterator.hasNext())
                {
                    System.out.print(i+":"+iterator.next().employee);
                    System.out.print("->");

                }
                System.out.println("null");
            }
        }
    }
}
