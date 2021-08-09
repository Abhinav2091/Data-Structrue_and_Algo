package com.luv2code.logicmojo.Arrays;

/**
 * We rotate an ascending order sorted array at some point unknown to user.
 * So for instance, 3 4 5 6 7 might become 5 6 7 3 4.
 * Modify binary search algorithm to find an element in the rotated array in
 * O(log n) time and O(1) Space complexity
 * if number does not exists return -1
 */


public class FindNumberInSortedRotatedArray {

    public static void main(String ar[]) {
        int array[] = {3, 4, 5, 6, 7, 8, 9, 10, 1, 2};
        int length = array.length;
        int value = 1;//1//3//28
        int result = findNumber(array, 0, length - 1, value);
        System.out.println(result);
    }

    static int findNumber(int array[], int startIndex, int lastIndex, int value) {
        boolean isPart = false;
        if (startIndex > lastIndex)
            return -1;
        //find the mid index
        //{ 3,4, 5, 6, 7, 8, 9, 1, 2} //7
        int midIndex = (startIndex + lastIndex) / 2;

        if (array[midIndex] == value)
            return midIndex;

        //first check this number with 0rth Index if it is greater mean it is a part of sorted array
        if (array[midIndex] >= array[startIndex]) {
            //if it is a part of sorted array then check value should be in between or equal to start and last Index
            if (value <= array[midIndex] && value >= array[startIndex])
                isPart = true;
        }
        if (isPart) {
            //if yes then apply binary search on left side until we find the number
            return findNumber(array, startIndex, midIndex - 1, value);
        } else {
            //if not value is present in right side apply binary search on right side
            return findNumber(array, midIndex + 1, lastIndex, value);
        }


    }
}
