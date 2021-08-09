package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;

/**
 * Write an algorithm to find out next greater number to given number with the same set of digits Asked in
 */


public class NextGreaterNumber {
    public static void main(String[] ar) {
        String val = "6938652";
        int[] valArray = new int[val.length()];
        for (int i = 0; i < val.length(); i++) {
            //System.out.println(val.charAt(i));
            valArray[i] = Integer.parseInt(String.valueOf(val.charAt(i)));
            // System.out.println(valArray[i]);
        }

        for (int arr : valArray) {
            System.out.print(arr + " ");
        }
        System.out.println();
        findNextNumber(valArray, valArray.length);
    }

    /**
     * to find the number approach used is
     * start from the end in pair if left is smaller than right
     * swap it with the immediate greater than that in the array
     * and then sort in asec after the index of swapped number
     */
    static void findNextNumber(int array[], int n) {
        int element = 0;
        int swapIndex = 0;
        int min = 0;
        //first loop to chek the pair and get the index to swap
        for (int i = n - 1; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                element = array[i - 1];
                swapIndex = i;
                break;
            }
        }
        System.out.println(element + " " + swapIndex);

        //second loop to find the imediate greater
        //because we check element in pair so we will start loop from +1
        for (int j = swapIndex + 1; j < n; j++) {
            //to find the imediate greater than elememnt
            if (array[j] > element && array[j] < array[swapIndex])
                min = j;
        }
        // System.out.println("min "+min);

        //swap the no on Indexes
        swap(array, swapIndex - 1, min);
        Arrays.sort(array, swapIndex, n);

        for (int arr : array) {
            System.out.print(arr + " ");

        }

    }

    static void swap(int[] array, int swapIndex, int min) {
        int tempIndex = array[swapIndex];
        array[swapIndex] = array[min];
        array[min] = tempIndex;
    }
}
