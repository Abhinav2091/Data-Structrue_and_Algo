package com.luv2code.gfg;

/**
 * given an array with size of choco packets
 * and no of student in which packet needs to be distributed
 * you need to find the sequance of chocolate whose packet different is minimum and each student should get one packet
 *
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ChocolateDistributionProblem {
    public static void main(String ar[]) {
        //int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int[] arr = {3,4,1,9,56,7,9,12};
        int noOfStudent = 5;
        Map<String, Integer> resultMap = new HashMap<>(3);
        chocoProblem(arr, resultMap, noOfStudent);
        for (Map.Entry<String, Integer> resMap : resultMap.entrySet()) {
            System.out.println(resMap.getKey() + ":" + resMap.getValue());
        }

    }

    private static Map<String, Integer> chocoProblem(int[] arr, Map<String, Integer> resultMap, int noOfStudents) {
        Arrays.sort(arr);
        int startIndex = 1;
        int minDiff = arr[noOfStudents - 1] - arr[0];
        resultMap.put("endIndex", noOfStudents-1);
        resultMap.put("startIndex", startIndex-1);
        for (int i = noOfStudents; i < arr.length; i++) {
            if (minDiff > arr[i] - arr[startIndex]) {
                minDiff = arr[i] - arr[startIndex++];
                resultMap.put("endIndex", i);
                resultMap.put("startIndex", startIndex-1);
            }
        }

        resultMap.put("diff", minDiff);
        System.out.println(Arrays.toString(arr));
        return resultMap;
    }
}
