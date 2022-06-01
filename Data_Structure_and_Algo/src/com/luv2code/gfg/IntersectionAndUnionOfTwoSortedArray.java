package com.luv2code.gfg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * find command element from two sorted array
 */
public class IntersectionAndUnionOfTwoSortedArray {
    public static void main(String ar[]) {
        int[] rightArray = {3, 3, 3, 5, 5, 5, 10, 10, 10, 15, 15, 20, 30, 40};
        int[] leftArray = {3, 3, 5, 10, 10, 15, 30};
        intersectedValues(leftArray, rightArray);
        System.out.println();
        commanValues(leftArray, rightArray);
    }

    private static void intersectedValues(int[] leftArray, int[] rightArray) {
        // Set<Integer> resultSet = new LinkedHashSet<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftIndex > 0 && leftArray[leftIndex] == leftArray[leftIndex - 1]) {
                leftIndex++;
                continue;
            }
            if (leftArray[leftIndex] < rightArray[rightIndex])
                leftIndex++;
            else if (leftArray[leftIndex] > rightArray[rightIndex])
                rightIndex++;
            else {
                System.out.print(leftArray[leftIndex] + ",");
                leftIndex++;
                rightIndex++;
            }
        }

        // return resultSet;
    }

    private static void commanValues(int[] leftArray, int[] rightArray) {
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftIndex > 0 && leftArray[leftIndex] == leftArray[leftIndex - 1]) {
                leftIndex++;
                continue;
            }
            if (rightIndex > 0 && rightArray[rightIndex] == rightArray[rightIndex - 1]) {
                rightIndex++;
                continue;
            }
            if (leftArray[leftIndex] < rightArray[rightIndex])
                System.out.print(leftArray[leftIndex++] + ",");
            else if (leftArray[leftIndex] > rightArray[rightIndex])
                System.out.print(rightArray[rightIndex++]+",");
            else {
                System.out.print(leftArray[leftIndex]+",");
                leftIndex++;
                rightIndex++;
            }

        }

        while (leftIndex < leftArray.length) {
            System.out.print(leftArray[leftIndex++] + ",");
        }

        while (rightIndex < rightArray.length) {
            System.out.print(rightArray[rightIndex++]+",");
        }

        // return resultSet;
    }
}
