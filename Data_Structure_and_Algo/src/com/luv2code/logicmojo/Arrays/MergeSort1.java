package com.luv2code.logicmojo.Arrays;

import java.sql.Array;
import java.util.Arrays;

public class MergeSort1 {

    // Sort array arr [low..high]

    public static void mergeSort(int[] arr, int[] tempArr, int low, int high) {

        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSort(arr, tempArr, low, mid);

        mergeSort(arr, tempArr, mid + 1, high);

        //time to merger the array in temp array and fix places in original value
        merge(arr, tempArr, low, high, mid);


    }

    public static void merge(int[] arr, int[] tempArr, int low, int high, int mid) {


        int tempLowForTempArr = low;
        int tempMid = mid + 1;
        int tempLowForArr = low;
        //placing the smaller value in temp array
        while (tempLowForArr <= mid && tempMid <= high) {
            if (arr[tempLowForArr] <= arr[tempMid])
                tempArr[tempLowForTempArr++] = arr[tempLowForArr++];
            else
                tempArr[tempLowForTempArr++] = arr[tempMid++];
        }
        //copy the left element in right side
        while (tempLowForArr <= mid)
            tempArr[tempLowForTempArr++] = arr[tempLowForArr++];
        while (tempMid <= high)
            tempArr[tempLowForTempArr++] = arr[tempMid++];

        //now copy the same in original array
        for (int i = 0; i <= high; i++)
            arr[i] = tempArr[i];



    }

    // Function to check if arr is sorted in ascending order or not
    public static boolean isSorted(int[] arr) {
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (prev > arr[i]) {
                System.out.println("Complete your code");
                return false;
            }
            prev = arr[i];
        }

        return true;
    }


    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 12, 25, 6, 13, 10};
        int[] tempArr = new int[arr.length];

        mergeSort(arr, tempArr, 0, arr.length - 1);

        if (isSorted(arr)) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
