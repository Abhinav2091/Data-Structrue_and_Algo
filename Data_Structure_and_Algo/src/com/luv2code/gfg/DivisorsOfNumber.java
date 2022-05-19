package com.luv2code.gfg;

import javafx.collections.transformation.SortedList;

import java.util.*;

public class DivisorsOfNumber {
    public static void main(String ar[]) {
        int a = 80;
        System.out.println(getDivisors(a));
        System.out.println(getDivisorsOptimized(a));
        System.out.println(getDivisorsOptimizedInSortedOrder(a));
    }

    private static List<Integer> getDivisors(int a) {

        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                resultList.add(i);
        }
        return resultList;

    }

    private static List<Integer> getDivisorsOptimized(int a) {

        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                resultList.add(i);
                if (i != a / i)
                    resultList.add(a / i);
            }
        }
        // Collections.sort(resultList);
        return resultList;

    }

    private static List<Integer> getDivisorsOptimizedInSortedOrder(int a) {

        List<Integer> resultList = new ArrayList<Integer>();
        int i = 0;
        for (i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                resultList.add(i);
            }
        }
        for (; i >= 1; i--) {
            if (a % i == 0) {
                resultList.add(a / i);
            }
        }
        return resultList;
    }
}
