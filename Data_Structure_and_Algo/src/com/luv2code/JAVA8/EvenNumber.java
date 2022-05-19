package com.luv2code.JAVA8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //even number
        myList.stream().filter(a -> a % 2== 0).forEach(System.out::println);
        //number start with 1
        System.out.println("***");
        myList.stream().map(a->a+"").filter(a->a.startsWith("1")).forEach(System.out::println);
        //find duplicate number
        System.out.println("***");
        HashSet<Integer> myHashSet = new HashSet<>();
        myList.stream().filter(a->!myHashSet.add(a)).forEach(System.out::println);
        //find first element
        System.out.println("***");
        myList.stream().findFirst().ifPresent(System.out::println);
        //find count
        System.out.println("***");
        System.out.println(myList.stream().count());
        //find max value
        System.out.println("***");
        System.out.println(myList.stream().max(Integer::compare).get());
        //find sum of values greater than 5
        List<Integer> myTempList = Arrays.asList(10,15,8,5);
        System.out.println(myTempList.stream().filter(a->a>10).mapToInt(a->a).sum());




    }
}
