package com.luv2code.HackerRank;

/*
 *
 * Number of subarrays having sum exactly equal to k
 */
public class SubArraySumProblem {

    public static void main(String ar[]) {
        int[] arr = {9, 4, 20, 3, 10, 5};
        int target = 33;

        int sumCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum = tempSum + arr[j];
                //System.out.println(i+":"+j+":"+tempSum);
                if (tempSum == target) {
                    // tempSum=0;
                    sumCount++;
                    break;
                }
            }
        }
        System.out.println(sumCount);
    }
}
