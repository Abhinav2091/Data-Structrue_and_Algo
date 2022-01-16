package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;

public class Greedy_Approach_1 {

    static int minimumNumberOfPlatform(int array[], int departure[], int n) {
        //first thing we will do is sort the departure array as arravial array will be in sorted form
        Arrays.sort(departure);
        int i = 0;
        int j = 0;
        int platformCount = 0;
        int maxPlatform = 0;
        while (i < array.length && j < departure.length) {
            if (array[i] <= departure[j]) {
                i++;
                platformCount++;
                if (platformCount > maxPlatform)
                    maxPlatform = platformCount;
            } else {
                j++;
                platformCount--;
            }
        }

        return maxPlatform;
    }

    public static void main(String[] args) {
        int[] arrival = {900,940,950,1100,1500,1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arrival.length;

        System.out.print("Minimum platforms required is "
                + minimumNumberOfPlatform(arrival, departure, n));
    }
}
