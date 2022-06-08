package com.luv2code.gfg;

import java.util.Arrays;

public class MinmumDiffrenceInArray {
    public static void main(String ar[]) {
        //int[] arr = {10, 8, 1, 4};
        //int[] arr = {10, 8};
        int[] arr = {10};
        if (arr.length > 1) {
            Arrays.sort(arr);
            int minDiff = arr[1] - arr[0];
            for (int i = 2; i < arr.length; i++) {

                minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
            }

            System.out.println(minDiff);
        }
    }
}
