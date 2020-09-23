package com.luv2code.samplePractice.JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String ar[])
    {
        //filter string starts with a using stream
        List<String> theList =new ArrayList<>();
        theList.add("Abhinav");
        theList.add("Sharma");
        theList.add("Aju");
        theList.add("Test");

        List<String> output= theList.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println(output);
    }
}

