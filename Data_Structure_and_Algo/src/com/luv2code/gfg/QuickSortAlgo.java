package com.luv2code.gfg;

import java.util.Arrays;

/**
 * we are going to use Partation class here
 */
public class QuickSortAlgo {
    public static void main(String ar[]) {
        int[] arr = {8, 4, 7, 9, 3, 10, 5};
        // int[] arr = {4, 7, 3, 5, 8};
        //lomutoApproach(arr, 0, arr.length-1);
        hoareApproach(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void lomutoApproach(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = lomutoAlgo(arr, start, end);
            //System.out.println(pivotIndex);
            lomutoApproach(arr, start, pivotIndex - 1);
            lomutoApproach(arr, pivotIndex + 1, end);
        }
    }

    private static int lomutoAlgo(int arr[], int start, int end) {
        int startIndex = start;
        int pivotValue = arr[end];
        for (int i = start; i < end; i++) {
            if (arr[i] < pivotValue)
                swap(arr, i, startIndex++);
        }
        swap(arr, startIndex, end);
        return startIndex;
    }

    private static void hoareApproach(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = hoareAlgo(arr, start, end);
            //System.out.println(pivotIndex);
            hoareApproach(arr, start, pivotIndex);
            hoareApproach(arr, pivotIndex + 1, end);

        }
    }

    private static int hoareAlgo(int arr[], int start, int end) {
        int startIndex = start;
        int pivotValue = arr[start];
        // int endIndex=end;
        while (true) {
            while (arr[startIndex] < pivotValue)
                startIndex++;
            while (arr[end] > pivotValue)
                end--;
            if (startIndex >= end) {
                //System.out.println( Arrays.toString(arr));
                return end;
            }
            swap(arr, startIndex++, end--);

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
