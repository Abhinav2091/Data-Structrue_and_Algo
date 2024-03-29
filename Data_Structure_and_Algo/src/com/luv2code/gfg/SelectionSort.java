package com.luv2code.gfg;
/**
 * put the min number first
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String ar[]) {
        int arr[] = {10, 5, 8, 20, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
