package com.luv2code.samplePractice.JavaPractice;

import com.luv2code.samplePractice.lists.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

public class HashcodeAndEquals {
    public static void main(String ar[]) {
        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(new Student(1, "Abhinav"), 1);
        studentMap.put(new Student(2, "Aju"), 2);
        studentMap.put(new Student(1, "Abhinav"), 3);
        studentMap.put(new Student(1, "Abhinav"), 4);
        System.out.println(studentMap.size());
        System.out.println(studentMap);

    }
}

class Student implements Comparable<Student> {
    private int rollNo;
    private String name;

    public Student() {
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        // if both the object references are
        // referring to the same object.
        if (this == object) return true;
        //object is instance of this class
        if (object == null || getClass() != object.getClass()) return false;

        // comparing the state of argument with
        // the state of 'this' Object.
        return this.rollNo == ((Student) object).rollNo && this.name.equals(((Student) object).name);
    }

    @Override
    public int hashCode() {
        //generate different hashcode only if both value don't exists already
        return Objects.hash(name, rollNo);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("rollNo=" + rollNo)
                .add("name='" + name + "'")
                .toString();
    }

    @Override
    public int compareTo(Student object) {
        //sort in asending
       return this.rollNo-object.getRollNo();
    }
}
