package com.luv2code.JAVA.functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
here even should come first and odd should second as they appers oin array
 */
public class EVENODDSort {
    public static void main(String ar[]) {
        Integer[] arr = {5, 20, 10, 3, 12};
        Arrays.sort(arr, new CustomizedClass());
        System.out.println(Arrays.toString(arr));
    }
}

class CustomizedClass implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 % 2 - o2 % 2;
    }
}
