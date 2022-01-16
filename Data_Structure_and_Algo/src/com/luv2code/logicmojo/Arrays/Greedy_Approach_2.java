package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Greedy_Approach_2 {
    public static void main(String[] args) {
        int ratings[] = {3, 1, 3, 7, 9, 11, 1};
        int result = candy(ratings);
        System.out.println(result);
    }

    private static int candy(int[] ratings) {
        //first i will sort the array so i know the minimum rating person is at left
        Map<Integer, Integer> candyMap = new HashMap<>();
        candyMap.put(0, 1);
        int minCandy = 1;
        Arrays.sort(ratings);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                candyMap.put(i, candyMap.get(i - 1) + 1);
            else
                candyMap.put(i, candyMap.get(i - 1));

            minCandy = minCandy + candyMap.get(i);
        }
        return minCandy;
    }

    private static int candyWithoutSorting(int[] ratings) {
        int minCandy = 1;
        int[] leftCandyArray = new int[ratings.length];
        int[] rightCandyArray = new int[ratings.length];
        leftCandyArray[0] = minCandy;
        rightCandyArray[ratings.length] = minCandy;
        //chek from left to right and strore value in temp array for later use
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                leftCandyArray[i] = leftCandyArray[i - 1] + 1;
        }
        //second loop to travers from right to left to get the max value out of both and add it
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (ratings[i] < ratings[i + 1])
                rightCandyArray[i] = rightCandyArray[i + 1] + 1;

        }
        //final loop to get the candy
        for (int i = 0; i < leftCandyArray.length; i++) {
            minCandy = minCandy + Math.max(leftCandyArray[i], rightCandyArray[i]);
        }
        return minCandy;
    }
}
