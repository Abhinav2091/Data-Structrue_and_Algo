package com.luv2code.gfg;

import java.util.Arrays;

public class MeetingMaxGuest {
    public static void main(String ar[]) {
        //int[] arr1 = {900, 940, 950, 1100, 1500, 1800};
        // int[] arr1 = {800,700,600,500};
        int[] arr1 = {900,940};
        //int[] arr2 = {910, 1200, 1120, 1130, 1900, 2000};
        //int[] arr2 = {840,820,830,530};
        int[] arr2 = {1000,1030};
        System.out.println(noOfMaxGuest(arr1, arr2));
        System.out.println(noOfMaxGuestAfterSorting(arr1, arr2));
    }

    private static int noOfMaxGuestAfterSorting(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int maxGuestCount = 1;
        int firstArrayIndex = 1;
        int secondArrIndex = 0;
        int tempMaxIndex = 1;
        while (firstArrayIndex < arr1.length && secondArrIndex < arr1.length) {

            if (arr1[firstArrayIndex] <= arr2[secondArrIndex]) {
                tempMaxIndex++;
                firstArrayIndex++;

            } else {
                tempMaxIndex--;
                secondArrIndex++;
            }
            maxGuestCount = Math.max(maxGuestCount, tempMaxIndex);
        }
        return maxGuestCount;
    }

    private static int noOfMaxGuest(int[] arr1, int[] arr2) {
        int maxPerson = 1;
        for (int i = 0; i <= arr1.length - 2; i++) {
            int tempMaxPerson = 1;
            for (int j = i + 1; j <= arr1.length - 1; j++) {
                if (arr1[j] >= arr1[i] && arr1[j] <= arr2[i])
                    tempMaxPerson++;
                else if (arr2[j] >= arr1[i] && arr2[j] <= arr2[i])
                    tempMaxPerson++;
            }
            if (maxPerson < tempMaxPerson)
                maxPerson = tempMaxPerson;
        }
        return maxPerson;
    }
}
