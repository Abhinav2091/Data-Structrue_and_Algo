package com.luv2code.logicmojo.Arrays;

/**
 * Array of length n having integers 1 to n with some elements being repeated.
 * Count frequencies of all elements from 1 to n in Time Complexity O(n) and Space Complexity O(1)
 */

public class FrequencyOfArrayElement {
    public static void main(String[] ar) {
        int[] input = {2, 3, 3, 2, 5};
        countFrequenciesEfficient(input);
    }

    private static void countFrequenciesEfficient(int input[]) {
        int arrayLength = input.length;

        //first we will decremt all the values in array because arrays start froom 0 not 1

        //then we will add n to the index value
        for (int i = 0; i < arrayLength; i++) {
            input[i] = --input[i];
        }
        //so that if we modules it % we will get nuber at that index
        for (int i = 0; i < arrayLength; i++) {
            int value = input[i] % arrayLength;
            input[value] = input[value] + arrayLength;
        }

        for (int arr : input) {
            System.out.println(arr);
        }

        //and finally we devive all the values with n so that we get the count and neet to add +1 in array index as we decreased it
        //at begining

    }
}
