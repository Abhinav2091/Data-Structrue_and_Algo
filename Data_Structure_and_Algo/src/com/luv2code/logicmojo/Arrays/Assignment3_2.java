package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;

public class Assignment3_2 {
    public static void main(String[] args) {

        int arrary[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        int[] tempLeftArray = new int[arrary.length];
        tempLeftArray[0] = Integer.MIN_VALUE;
        //System.out.println(arr[arr.length]);
        //first loop to find the max value on left side
        for (int i = 1; i < arrary.length; i++) {
            tempLeftArray[i] = Math.max(tempLeftArray[i - 1], arrary[i - 1]);
        }

        int right = Integer.MAX_VALUE;
        //second loop to iterate from right to find righ min andd check our loop at same time
        for (int i = arrary.length - 1; i >= 0; i--) {
            if (tempLeftArray[i] < arrary[i] && right > arrary[i]) {
                System.out.println("index:" + i + "number:" + arrary[i]);
            }
            right = Math.min(right, arrary[i]);
        }

    }
}
