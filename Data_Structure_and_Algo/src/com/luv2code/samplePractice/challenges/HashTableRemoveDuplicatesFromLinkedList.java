package com.luv2code.samplePractice.challenges;

import com.luv2code.samplePractice.lists.Employee;

import java.util.*;

public class HashTableRemoveDuplicatesFromLinkedList {
    public static void main(String ar[]) {
        Employee Abhinav = new Employee("Abhinav", "Sharma", 1);
        Employee Abhi = new Employee("Abhi", "Kumar", 13);
        Employee Himanshu = new Employee("Himanshu", "Tiwari", 1456);
        Employee Sid = new Employee("Sid", "Singh", 10000);
        Employee Aju = new Employee("Aju", "Sri", 11110000);

        LinkedList<Employee> employeesList = new LinkedList<>();
        employeesList.add(Aju);
        employeesList.add(Sid);
        employeesList.add(Himanshu);
        employeesList.add(Abhi);
        employeesList.add(Abhinav);
        employeesList.add(Aju);
        employeesList.add(Abhinav);
        employeesList.add(Sid);

        employeesList.forEach(e -> System.out.println(e));

        Map<Integer, Employee> employeeTab = new HashMap<>();
        ListIterator<Employee> iterator = employeesList.listIterator();
        List<Employee> removeList = new ArrayList<>();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeTab.containsKey(employee.getId())) {
                removeList.add(employee);
            } else {
                employeeTab.put(employee.getId(), employee);
            }
        }

        for (Employee employee : removeList) {
            employeesList.remove(employee);
        }

        System.out.println("*************************");

        employeesList.forEach(e -> System.out.println(e));

    }
}
