package com.luv2code.logicmojo.Arrays;

/**
 * we have array which contain only 0s,1s and 2s now we need to sort this array
 * You are not suppose to use any extra space
 * You need change the same array with single traversal with O(n) time complexity
 */

public class CountingSort {

    public static void main(String ar[]) {
        int array[] = {2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 2};
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        sortArray(array);

        System.out.println();
        for (int arr : array) {
            System.out.print(arr + " ");
        }

    }

    static void sortArray(int array[]) {
        int startIndex = 0;
        int midIndex = 0;
        int lastIndex = array.length - 1;
//iterate unless i reach to last index which will be the index of 2s starting
        while (midIndex <= lastIndex) {
            //if this value is zero then swap this value with start index and increment start and mid index
            if (array[midIndex] == 0) {
                swap(array, startIndex, midIndex);
                ++startIndex;
                ++midIndex;
            }
            //if this value is 2 then swap this value with last index and decrement last index
            else if (array[midIndex] == 2) {
                swap(array, midIndex, lastIndex);
                //++midIndex;
                --lastIndex;
            }
            //if this value is 1 do nothing and increment mid index
            else
                ++midIndex;


        }
    }

    static void swap(int array[], int start, int last) {
        int tempVar = array[start];
        array[start] = array[last];
        array[last] = tempVar;
    }

}
