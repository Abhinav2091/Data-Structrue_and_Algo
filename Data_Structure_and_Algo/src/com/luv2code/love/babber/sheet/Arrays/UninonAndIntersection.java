package com.luv2code.love.babber.sheet.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UninonAndIntersection {
    public static void main(String ar[]) {
        //int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr1 = {85, 25, 1, 32, 54, 6, 2};
        // int[] arr2 = {1, 2, 3};
        int[] arr2 = {85, 2, 85};
        int[] temArray = new int[arr1.length + arr2.length];
        int intersectionCount = findIntersectionCount(arr1, arr1.length, arr2, arr2.length, temArray);
        int count = findUninonCount(arr1, arr1.length, arr2, arr2.length, temArray);
        System.out.println(Arrays.toString(temArray));
        System.out.println(count);
        System.out.println(intersectionCount);

    }

    private static int findIntersectionCount(int[] arr1, int length, int[] arr2, int length1, int[] temArray) {
        Set<Integer> leftSet = new HashSet<>();
        Set<Integer> rightSet = new HashSet<>();
        int resultIntersectionCount = 0;
        for (int ar : arr1)
            leftSet.add(ar);
        for (int ar : arr2) {
            if (rightSet.add(ar) && !leftSet.add(ar))
                resultIntersectionCount++;
        }
        return resultIntersectionCount;

    }

    private static int findUninonCount(int[] arr1, int leftLen, int[] arr2, int rightLen, int[] temArray) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int leftIndex = 0;
        int rightIndex = 0;
        int temIndex = 0;
        while (leftIndex < leftLen && rightIndex < rightLen) {
            if (temIndex > 0 && arr1[leftIndex] == temArray[temIndex - 1]) {
                leftIndex++;
                continue;
            }
            if (temIndex > 0 && arr2[rightIndex] == temArray[temIndex - 1]) {
                rightIndex++;
                continue;
            }
            if (arr1[leftIndex] == arr2[rightIndex]) {
                temArray[temIndex++] = arr1[leftIndex];
                leftIndex++;
                rightIndex++;

            } else if (arr1[leftIndex] < arr2[rightIndex]) {
                temArray[temIndex++] = arr1[leftIndex];
                leftIndex++;
            } else {
                temArray[temIndex++] = arr2[rightIndex];
                rightIndex++;
            }

        }

        while (leftIndex < leftLen) {
            if (temIndex > 0 && arr1[leftIndex] == temArray[temIndex - 1]) {
                leftIndex++;
                continue;
            }
            temArray[temIndex++] = arr1[leftIndex++];

        }
        while (rightIndex < rightLen) {
            if (temIndex > 0 && arr2[rightIndex] == temArray[temIndex - 1]) {
                rightIndex++;
                continue;
            }
            temArray[temIndex++] = arr2[rightIndex++];

        }
        return temIndex;
    }
}
