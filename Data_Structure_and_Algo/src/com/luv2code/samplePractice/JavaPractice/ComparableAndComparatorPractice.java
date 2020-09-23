package com.luv2code.samplePractice.JavaPractice;

import java.util.*;

public class ComparableAndComparatorPractice  implements Comparator<Student> {

    public static void main(String ar[]) {

        // Student class in HashcodeAndEquals implements comparable to store student in asending order
        Student[] student = new Student[4];
        student[0] = new Student(5, "Abhinav");
        student[1] = new Student(2, "Aju");
        student[2] = new Student(1, "Test");
        student[3] = new Student(0, "Ram");
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

        List<Student> studentList=new ArrayList<>();
        for(int i=0;i<student.length;i++)
        {
            studentList.add(student[i]);
        }
        //passing compartor for sorting in desending order on basis of roll number
        Collections.sort(studentList,new ComparableAndComparatorPractice());
        System.out.println(studentList);
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getRollNo()==o2.getRollNo())
            return 0;
        else if(o1.getRollNo()>o2.getRollNo())
            return -1;
        else
        return 1;
    }
}

