package com.luv2code.gfg;

import java.util.Arrays;

/*
pick first element consider it as largest element iterate till you reach end with max element
 */
public class BubbleSort {

    public static void main(String ar[]) {
        int arr[] = {5, 6, 10, 20, 40};
        // bubbleSort(arr);
        //bubbleSortOptimized(arr);
        moreOptimizedBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moreOptimizedBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            //System.out.println("i" + i);
            for (int j = 0; j < arr.length - i - 1; j++) {
                //  System.out.println("j" + j);
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }

    private static void bubbleSortOptimized(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
