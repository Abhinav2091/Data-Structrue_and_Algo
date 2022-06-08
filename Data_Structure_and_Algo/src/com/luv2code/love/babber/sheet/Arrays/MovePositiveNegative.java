package com.luv2code.love.babber.sheet.Arrays;

import java.util.Arrays;

public class MovePositiveNegative {
    public static void main(String ar[]) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int length = arr.length;
        moveNegativeAndPositive(arr, length);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveNegativeAndPositive(int[] arr, int length) {
        int startIndex = 0;
        int endIndex = length - 1;
        while (startIndex <= endIndex) {
            if (arr[startIndex] < 0)
                startIndex++;
            else {
                swap(arr, startIndex, endIndex--);
            }
        }
    }

    private static void swap(int[] arr, int startIndex, int i) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[i];
        arr[i] = temp;
    }
}
