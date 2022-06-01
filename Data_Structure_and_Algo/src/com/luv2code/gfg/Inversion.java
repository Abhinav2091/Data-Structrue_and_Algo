package com.luv2code.gfg;

import java.util.Arrays;

/**
 * eg:a=[2,4,1,3,5]   ||  (2,4),(4,1),(4,3) no of inversion =3
 * pair will be called inversion if
 * i<j
 * a[i]>a[j]
 */

public class Inversion {
    public static void main(String ar[]) {
        //int arr[] = {2, 4, 1, 3, 5};
        //int arr[] = {1, 2, 3, 4};
        //int arr[] = {4, 3, 2, 1};
        int arr[] = {8, 5, 11, 2, 3, 13, 6, 9};
        System.out.println(noOfInversion(arr));
        System.out.println(noOfInversionUsingMergeSort(arr));
    }

    private static int noOfInversionUsingMergeSort(int[] arr) {
        int noOfInversion = 0;
        int[] tempArr = new int[arr.length];
        noOfInversion = divide(arr, tempArr, 0, arr.length - 1);

        return noOfInversion;
    }

    private static int divide(int[] arr, int[] tempArr, int start, int end) {
        int noOfInversion = 0;
        if (start == end)
            return noOfInversion;
        int mid = (start + end) / 2;
        noOfInversion = noOfInversion + divide(arr, tempArr, start, mid);
        noOfInversion = noOfInversion + divide(arr, tempArr, mid + 1, end);
        noOfInversion = noOfInversion + merge(arr, tempArr, start, end, mid);
        return noOfInversion;
    }

    private static int merge(int[] arr, int[] tempArr, int start, int end, int mid) {
        int noOfInversion = 0;
        int startIndex = start;
        int temIndex = start;
        int midIndex = mid + 1;
        while (startIndex <= mid && midIndex <= end) {
            if (arr[startIndex] > arr[midIndex]) {
                noOfInversion = noOfInversion + (mid + 1 - startIndex);
                tempArr[temIndex++] = arr[midIndex++];
            } else if (arr[startIndex] < arr[midIndex])
                tempArr[temIndex++] = arr[startIndex++];
            else {
                tempArr[temIndex++] = arr[startIndex];
                startIndex++;
                midIndex++;
            }
        }

        while (startIndex <= mid)
            tempArr[temIndex++] = arr[startIndex++];
        while (midIndex <= end)
            tempArr[temIndex++] = arr[midIndex++];
        for (int i = start; i <= end; i++)
            arr[i] = tempArr[i];
        return noOfInversion;

    }

    private static int noOfInversion(int[] arr) {
        int noOfInversion = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    noOfInversion++;
            }
        }
        return noOfInversion;
    }
}
