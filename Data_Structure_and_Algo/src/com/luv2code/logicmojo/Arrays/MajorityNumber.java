package com.luv2code.logicmojo.Arrays;

/**
 * Given an array of integer,
 * write an efficient algorithm to find majority number in that array in Time Complexity O(n)
 * and Space Complexity O(1)
 */


public class MajorityNumber {

    public static void main(String[] ar) {
        int[] input = {1, 8, 7, 4, 1, 4, 2, 2, 1, 2, 2};
        System.out.println(majorElement(input));
    }

    private static int majorElement(int[] input) {
        int majorElement = input[0];
        int count = 1;

        for (int i = 1; i < input.length; i++) {
            if (input[i] != majorElement)
                count--;
            else
                count++;

            if (count == 0) {
                majorElement = input[i];
                count = 1;
            }
        }

        return majorElement;

    }
}
