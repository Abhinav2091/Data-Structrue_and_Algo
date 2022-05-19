
package com.luv2code.logicmojo.Arrays;


/**
 * Array of length n having integers 1 to n with some elements being repeated.
 * Count frequencies of all elements from 1 to n in Time Complexity O(n) and Space Complexity O(1)
 */


public class FrequencyOfArrayElement0_1 {
    public static void main(String[] ar) {
        int[] input = {5, 1, 2, 5, 5, 5, 1, 1, 2, 2};
        countFrequenciesEfficient(input);
    }

    private static void countFrequenciesEfficient(int[] input) {
        int arrayLength = input.length;

        for (int i = 0; i < arrayLength; i++) {
            input[i] = input[i] - 1;
        }

        for (int i = 0; i < arrayLength; i++) {
            int value = input[i] % arrayLength;
            input[value] = input[value] + arrayLength;
        }

        for (int i = 0; i < arrayLength; i++) {
          //  System.out.print(input[i]+",");
            System.out.println((i + 1) + "-->" + input[i] / arrayLength + ",");
        }
    }


}


