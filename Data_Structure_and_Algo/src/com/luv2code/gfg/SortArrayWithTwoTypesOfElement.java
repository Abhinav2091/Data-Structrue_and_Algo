package com.luv2code.gfg;

import java.util.Arrays;

public class SortArrayWithTwoTypesOfElement {
    public static void main(String ar[]) {
        //for -ve positive
        // int[] arr = {15, -3, -2, 18};
        //for evenOddProblem
        //int[] arr ={15,14,13,12};
        //for 0s and 1ns
        int[] arr = {0, 1, 1, 1, 0};
        //System.out.println(Arrays.toString(sortTwoTypeOfArray(arr)));
        byUsingLomutoAlgo(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

    private static void byUsingLomutoAlgo(int[] arr, int start, int end) {

        int startIndex = start;
        for (int i = start; i <= end; i++)
            //for -ve positive
            //  if (arr[i] < 0)
            //for evenOddProblem
            // if (arr[i] %2 == 0)
            //for 0s and 1ns
            if (arr[i] == 0)
            swap(arr, i, startIndex++);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    private static int[] sortTwoTypeOfArray(int[] arr) {
        int[] tempArr = new int[arr.length];
        int startIndex = 0;
        int tempStartIndex = 0;
        int endIndex = arr.length - 1;
        while (tempStartIndex <= endIndex) {
            if (arr[startIndex] < 0)
                tempArr[tempStartIndex++] = arr[startIndex++];
            else
                tempArr[endIndex--] = arr[startIndex++];
        }
        return tempArr;
    }
}
