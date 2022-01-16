package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;

public class Assignment3_1 {
    // Given number as int array, this function finds the greatest number and give the number as integer
    static void findNextNumber(int array[], int n) {
        //first we need to find the index that we can swap to get the no
        int i = 0;

        for (i = n - 1; i > 0; i--) {
            if (array[i] > array[i - 1])
                break;
        }
       // System.out.println("i:"+(i-1));
     //   {5,3,4,9,7,6};
        //if not enter in loop then
        int swapIndex = i;
        int imediateHigerNumberToSwap = array[i];

        for (int j = i + 1; j < n ; j++) {
            //System.out.println(array[j]);
            //System.out.println(array[i - 1]);
            //System.out.println(array[i]);
            if (array[j] > array[i - 1] && array[j] < array[i]) {
                imediateHigerNumberToSwap = array[j];
                swapIndex = j;
            }
        }
        //System.out.println("imediateHigerNumberToSwap:"+imediateHigerNumberToSwap);
        //System.out.println("swapIndex:"+swapIndex);
        swap(array, array[i - 1], imediateHigerNumberToSwap, i - 1, swapIndex);
        Arrays.sort(array, i, n);
        Arrays.stream(array).forEach(System.out::print);
    }

    public static void swap(int[] array, int no1, int no2, int index1, int index2) {
        array[index1] = no2;
        array[index2] = no1;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        int n = array.length;
        findNextNumber(array, n);
    }
}
