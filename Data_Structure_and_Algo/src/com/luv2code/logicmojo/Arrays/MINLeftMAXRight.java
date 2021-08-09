package com.luv2code.logicmojo.Arrays;

/**
 * \
 * We have an array, we have to find an element before which all elements are less than it,
 * and after which all are greater than it. Finally, return the index of the element,
 * if there is no such element, then return -1:
 * Time complexity O(n) and Space Complexity O(n)
 */

public class MINLeftMAXRight {

    public static void main(String ar[]) {
        int arr[] = {5, 1, 4, 4};
        int resultIndex = findNumberIndex(arr);
        if (resultIndex != -1)
            System.out.println(resultIndex + " " + arr[resultIndex]);

    }

    static int findNumberIndex(int[] array) {
    /*
    start a loop to fill the left array with max number from that Index
     */
        int[] leftMax = new int[array.length];
        //there is no point of checking 0rth Index
        leftMax[0] = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            leftMax[i] = Math.max(array[i - 1], leftMax[i - 1]);
        }

        //put max value on right to compare it with leftMax array
        int rightMin = Integer.MAX_VALUE;
        //start a second loop to get the number
        for (int j = array.length - 1; j >= 0; j--) {

            if (array[j] > leftMax[j] && array[j] < rightMin)
                return j;

            rightMin = Math.min(array[j], rightMin);
        }

        return -1;
    }

}
