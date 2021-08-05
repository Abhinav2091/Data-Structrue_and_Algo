package com.luv2code.logicmojo;

/**
 * There are N children standing in a line with some rating value.
 * You want to distribute a minimum number of candies to these children such that:
 * Each child must have at least one candy. The children with higher ratings will have more candies than their neighbors.
 * You need to write a program to calculate the minimum candies you must give.
 */

public class DistributeCandy {
    public static void main(String ar[]) {
        int ratings[] = {1, 5, 2, 1};
        int result = minCandy(ratings);
        System.out.println(result);
    }

    static int minCandy(int[] array) {
        int noOfStudent = array.length;
        int sum = 0;
        int[] leftCandyArray = new int[noOfStudent];
        leftCandyArray[0] = 1;

        int[] rightCandyArray = new int[noOfStudent];
        rightCandyArray[noOfStudent - 1] = 1;

        //first for loop to traverse from left to right to insert candy
        //will start from 1 beacuse each should have atleast one candy
        for (int i = 1; i < noOfStudent; i++) {
            if (array[i] > array[i - 1])
                leftCandyArray[i] = leftCandyArray[i - 1]++;
            else
                leftCandyArray[i] = 1;

        }

        //second for loop to traverse from right to left to insert candy
        //will start from 1 beacuse each should have atleast one candy
        for (int i = noOfStudent - 2; i >= 0; i--) {
            if (array[i] > array[i + 1])
                rightCandyArray[i] = rightCandyArray[i + 1]++;
            else
                rightCandyArray[i] = 1;

        }

        //last for loop to find the max from above two and get the min candy
        for (int i = 0; i < noOfStudent; i++) {
            sum = sum + Math.max(leftCandyArray[i], rightCandyArray[i]);
        }
        return sum;
    }
}
