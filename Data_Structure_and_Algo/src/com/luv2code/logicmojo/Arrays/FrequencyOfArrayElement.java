package com.luv2code.logicmojo.Arrays;

/**
 * Array of length n having integers 1 to n with some elements being repeated.
 * Count frequencies of all elements from 1 to n in Time Complexity O(n) and Space Complexity O(1)
 */

public class FrequencyOfArrayElement {
    public static void main(String[] ar) {
        int[] input = {1, 2, 2, 1, 1, 2, 3, 2};
        countFrequenciesEfficient(input);
    }

    private static void countFrequenciesEfficient(int[] input) {
        int arrayLength = input.length;

        //first we will decremt all the values in array because arrays start froom 0 not 1

        //then we will add n to the index value
        for (int i = 0; i < arrayLength; i++) {
            input[i] = --input[i];
            //{1, 2, 2, 1, 4}
        }
        //so that if we modules it % we will get nuber at that index
        for (int i = 0; i < arrayLength; i++) {
            int value = input[i] % arrayLength;
            // System.out.println(value+" "+input[value]);
            input[value] = input[value] + arrayLength;
        }

        //and finally we devide all the values with n so that we get the count and neet to add +1 in array index as we decreased it
        //at begining

        for (int i = 0; i < arrayLength; i++) {
            System.out.println((i + 1) + "---->" + input[i] / arrayLength);
        }


    }
}
