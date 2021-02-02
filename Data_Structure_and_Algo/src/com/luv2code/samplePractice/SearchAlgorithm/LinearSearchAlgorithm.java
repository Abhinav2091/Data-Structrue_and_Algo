package com.luv2code.samplePractice.SearchAlgorithm;

public class LinearSearchAlgorithm {
    public static void main(String ar[]) {
        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("index of value::else return -1::" + linearSearch(inputArray, 0));

    }

    public static int linearSearch(int[] inputArray, int value) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == value)
                return i;
        }
        return -1;
    }
}
