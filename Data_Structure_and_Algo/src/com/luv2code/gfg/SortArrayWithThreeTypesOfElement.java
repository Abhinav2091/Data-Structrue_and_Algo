package com.luv2code.gfg;
/**
 * Dutch National flag algo
 */

import java.util.Arrays;

public class SortArrayWithThreeTypesOfElement {
    public static void main(String ar[]) {
        //partationAround range
         int[] arrr = {10,5,6,3,20,9,40};
         int pivotStartingElement=5;
         int pivotEndElement=10;
        byDutchNationalFlagAlgo(arrr, 0, arrr.length - 1, pivotStartingElement,pivotEndElement);
        System.out.println(Arrays.toString(arrr));
        //Three way partation
        //all the smaller element from pivot occur on left greater on right and pivot combined in middle
        int[] arr = {2, 1, 2, 20, 10, 20, 1};
        int pivotElement = 2;
        //for 0s, 1ns and 2s
        //int[] arr = {0, 2, 1, 1, 0, 2, 2, 1, 1, 1, 2, 2, 0, 0};
        //int pivotElement=1;
        //System.out.println(Arrays.toString(sortTwoTypeOfArray(arr)));
        byDutchNationalFlagAlgo(arr, 0, arr.length - 1, pivotElement);
        System.out.println(Arrays.toString(arr));
    }

    private static void byDutchNationalFlagAlgo(int[] arr, int start, int end, int pivotStartingElement, int pivotEndElement) {
        int startIndex = start;
        int midIndex = start;
        int endIndex = end;

        while (midIndex < endIndex) {
            if (arr[midIndex] < pivotStartingElement)
                swap(arr, startIndex++, midIndex++);
            else if (arr[midIndex] > pivotEndElement)
                swap(arr, midIndex, endIndex--);
            else
                midIndex++;

        }
    }

    private static void byDutchNationalFlagAlgo(int[] arr, int start, int end, int pivotElement) {
        int startIndex = start;
        int midIndex = start;
        int endIndex = end;

        while (midIndex < endIndex) {
            if (arr[midIndex] < pivotElement)
                swap(arr, startIndex++, midIndex++);
            else if (arr[midIndex] > pivotElement)
                swap(arr, midIndex, endIndex--);
            else
                midIndex++;

        }
    }

    private static void swap(int[] arr, int o1, int o2) {
        int temp = arr[o1];
        arr[o1] = arr[o2];
        arr[o2] = temp;
    }
}
