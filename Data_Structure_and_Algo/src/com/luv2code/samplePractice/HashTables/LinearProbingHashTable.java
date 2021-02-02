package com.luv2code.samplePractice.HashTables;

import com.luv2code.samplePractice.lists.Employee;

public class LinearProbingHashTable {

    private StoredEmployeeForLinearProbingRetrieval[] hashTable;

    public LinearProbingHashTable() {
        hashTable = new StoredEmployeeForLinearProbingRetrieval[10];
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;

    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            //to loop around and stop the loop from where we start
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                //wrap around if it is at the end of the array
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                //to wrap around
                //eg if we reach at the end hashedkey =0 which mean start from 0 now
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }
        //after first if it will git into this only if it is full
        if (occupied(hashedKey))
            System.out.println("Sorry this hashtable is fill");
        else {
            hashTable[hashedKey] = new StoredEmployeeForLinearProbingRetrieval(key, employee);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1)
            return null;
        else
            return hashTable[hashedKey].employee;

    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println((hashTable[i] == null) ? "empty" : hashTable[i].employee);
        }
    }

    private boolean occupied(int index) {
        return hashTable[index] != null;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].rawKey.equals(key)) {
            return hashedKey;
        } else {

            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                //wrap around if it is at the end of the array
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (hashTable[hashedKey] != null && hashedKey != stopIndex && !hashTable[hashedKey].rawKey.equals(key)) {
                //to wrap around
                //eg if we reach at the end hashedkey =0 which mean start from 0 now
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
            //mean we searched the entire loop
            if (hashTable[hashedKey] != null && hashTable[hashedKey].rawKey.equals(key))
                return hashedKey;
            else
                return -1;

        }

    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1)
            return null;

            Employee employee = hashTable[hashedKey].employee;
            hashTable[hashedKey] = null;
        //rehashing in case of delte so we dont get null when we earch for key after that
        StoredEmployeeForLinearProbingRetrieval[] oldHashTable= hashTable;
        hashTable =new StoredEmployeeForLinearProbingRetrieval[hashTable.length];
        for(int i=0;i<oldHashTable.length;i++)
        {
            if(oldHashTable[i]!=null)
            {
                put(oldHashTable[i].rawKey,oldHashTable[i].employee);
            }
        }

            return employee;


    }
}
