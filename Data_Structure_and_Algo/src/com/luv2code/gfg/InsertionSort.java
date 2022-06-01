package com.luv2code.gfg;

import java.util.Arrays;

/**
 * insert the lowest element in left side sorted array correct position
 */
public class InsertionSort {
    public static void main(String ar[]) {
        int arr[] = {20, 5, 40, 60, 10, 30};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("i***********" + i);
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                System.out.println("j**" + j);
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
