package com.luv2code.gfg;
/**
 * all the left element should be less than pivot and right greater
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Partition {
    public static void main(String ar[]) {
        int t = 0;
        //int arr[] = {6, 8, 3, 12, 10, 7};
        int[] arr = {15, 80, 30, 30, 30, 90, 10, 50, 70};
        int pivotIndex = 8;
        //System.out.println(Arrays.toString(naivePartition(arr, 0, arr.length, pivotIndex)));
        //System.out.println(Arrays.toString(lomutoPartition(arr, 0, arr.length, pivotIndex)));
        System.out.println(arr.length + "::" + arr[pivotIndex] + "::" + Arrays.toString(hoaresPartition(arr, 0, arr.length - 1, pivotIndex)));
    }

    private static int[] hoaresPartition(int[] arr, int start, int end, int pivotIndex) {
        //swap the pivot number with first as in hoare algo we always consider first as the pivot
        //also it will not place the pivot in exact position it will just place less value on left and high value at right
        swap(arr, start, pivotIndex);
        int startIndex = start - 1;
        int endIndex = end + 1;
        int pivotValue = arr[start];


        while (true) {
            do {
                startIndex++;
            } while (arr[startIndex] < pivotValue);
            do {
                endIndex--;
            } while (arr[endIndex] > pivotValue);
            if (startIndex >= endIndex)
                return arr;
            swap(arr, startIndex, endIndex);

        }

    }

    private static int[] lomutoPartition(int[] arr, int start, int end, int pivotIndex) {
        int startIndex = start;
        int pivotValue = arr[pivotIndex];
        //swap the pivot number with last as in lomuto algo we always consider last as the pivot
        swap(arr, pivotIndex, end - 1);
        for (int i = start; i < end; i++) {
            if (arr[i] < pivotValue)
                swap(arr, i, startIndex++);
        }
        //finally swap the pivot to it actual index
        swap(arr, startIndex, end - 1);
        return arr;
    }

    private static void swap(int[] arr, int pivotIndex, int length) {
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[length];
        arr[length] = temp;
    }

    private static int[] naivePartition(int[] arr, int start, int end, int pivot) {
        int[] temArr = new int[end - start];
        int tempIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[pivot])
                temArr[tempIndex++] = arr[i];
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == arr[pivot])
                temArr[tempIndex++] = arr[i];
        }
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[pivot])
                temArr[tempIndex++] = arr[i];
        }
        for (int i = start; i < end; i++) {
            arr[i] = temArr[i];
        }
        return arr;
    }
}
