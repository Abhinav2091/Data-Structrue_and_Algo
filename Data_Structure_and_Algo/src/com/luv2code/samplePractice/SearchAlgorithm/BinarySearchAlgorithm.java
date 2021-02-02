package com.luv2code.samplePractice.SearchAlgorithm;

import java.util.Arrays;

public class BinarySearchAlgorithm {
    public static void main(String ar[]) {
        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        //need to sort for this algorithm
        Arrays.sort(inputArray);
        System.out.println("Index of value else -1:" + binarySearchAlgoIteratively(inputArray, 55));
        System.out.println("Index of value else -1:" + binarySearchAlgoRecursion(inputArray, 0, inputArray.length, 55));
    }

    public static int binarySearchAlgoIteratively(int[] sortedArray, int value) {
        int startIndex = 0;
        int endIndex = sortedArray.length;
        while (startIndex < endIndex) {
            int midValue = (endIndex + startIndex) / 2;
            if (sortedArray[midValue] == value) {
                return midValue;
            } else if (value > sortedArray[midValue]) {
                startIndex = midValue + 1;
            } else {
                endIndex = midValue;
            }
        }
        return -1;
    }

    public static int binarySearchAlgoRecursion(int[] sortedArray, int startIndex, int endIndex, int value) {
        if (startIndex >= endIndex)
            return -1;
        int midValue = (endIndex + startIndex) / 2;
        if (sortedArray[midValue] == value)
            return midValue;
        else if (value > sortedArray[midValue])
            return binarySearchAlgoRecursion(sortedArray, midValue + 1, endIndex, value);
        else
            return binarySearchAlgoRecursion(sortedArray, startIndex, midValue, value);

    }
}
