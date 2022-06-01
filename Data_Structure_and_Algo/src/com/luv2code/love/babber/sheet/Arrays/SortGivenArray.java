package com.luv2code.love.babber.sheet.Arrays;

import java.util.Arrays;

/**
 * we have given an array of 0,1 and 2 need to sort it in O(n)
 * and no extra space
 */
public class SortGivenArray {
    public static void main(String ar[]) {
        int arr[] = {0, 1, 2, 2, 2, 2, 0, 0, 1};
        System.out.println(Arrays.toString(lomutoAlgoApproachNotEfficient(arr)));
    }

    private static int[] lomutoAlgoApproachNotEfficient(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int[] tempArr = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 0)
                tempArr[start++] = 0;
            else if (arr[i] == 2)
                tempArr[end--] = 2;
        }
        //System.out.println(start);
        // System.out.println(end);
        while (start <= end)
            tempArr[start++] = 1;
        // System.out.println(Arrays.toString(tempArr));
        return tempArr;
    }
}
