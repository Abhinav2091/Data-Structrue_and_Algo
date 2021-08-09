package com.luv2code.logicmojo.Arrays;

/**
 * Given an array nums,
 * write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements in O(n)
 * Time complexity and O(1) Space complexity with single traversal allowed
 */

public class MoveOsToLeft {
    public static void main(String ar[]) {
        int array[] = {1, 3, 0, 0, 4, 0, 9};
        int length = array.length;
        moveZeros(array);
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    static void moveZeros(int[] array) {
        int count = 0;
        int lastCount = array.length - 1;
        //have a count of non zero element and increment it when ever we hit non zero element
        //{1,3,0,0,4,0,9}
        //if we meet 0 do nothing
        for (int arr : array) {
            if (arr != 0) {
                array[count++] = arr;
            }
        }
        //now run a loop after the count to make all other as zero
        while (count < array.length) {
            array[count++] = 0;
        }
    }

}
