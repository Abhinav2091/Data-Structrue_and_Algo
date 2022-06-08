package com.luv2code.love.babber.sheet.Arrays;

import java.util.Arrays;

public class SortArrayOf01and2 {
    public static void main(String ar[]) {
        // int[] arr = {0, 2, 1, 2, 0};
        int[] arr = {0, 1, 1, 0, 2, 0, 1, 0, 2, 2};
        //  sort012(arr, arr.length);
        sortByDutchNationalFlagAlgo(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortByDutchNationalFlagAlgo(int[] arr, int length) {
        int startIndex = 0;
        int midIndex = 0;
        int endIndex = length - 1;
        while (midIndex <= endIndex) {
            if (arr[midIndex] < 1) {
                swap(arr, startIndex++, midIndex++);
            } else if (arr[midIndex] > 1) {
                swap(arr, midIndex, endIndex--);
            } else
                midIndex++;
        }

    }


    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    private static void sort012(int a[], int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                count0++;
            else if (a[i] == 1)
                count1++;
            else
                count2++;
        }
        for (int i = 0; i < n; i++) {
            if (count0 > 0) {
                a[i] = 0;
                count0--;
            } else if (count1 > 0) {
                a[i] = 1;
                count1--;
            } else {
                a[i] = 2;
                count2--;
            }
        }


    }
}
