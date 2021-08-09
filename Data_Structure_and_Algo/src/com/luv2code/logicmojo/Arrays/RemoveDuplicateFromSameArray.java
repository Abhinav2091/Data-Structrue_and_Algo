package com.luv2code.logicmojo.Arrays;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, Time complexity O(n) and Space complexity O(1)
 */
public class RemoveDuplicateFromSameArray {

    public static void main(String ar[]) {
        int array[] = {1,2,3,4,5};

        int resultLength = removeDuplicate(array);

        for (int i = 0; i < resultLength; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int removeDuplicate(int[] array) {
        int tempIndex = 0;
        int arrayLength = array.length;

        //if length is equal to 0 or 1 return
        if (arrayLength == 0 || arrayLength == 1)
            return arrayLength;

        //run the loop till second last Index
        for (int i = 0; i < arrayLength - 1; i++) {


            //compare if element on neighbour array are same or not
            //if they are same continue to next element
            if (array[i] == array[i + 1])
                continue;
            //put the value in place of Temp Index and Update it and increment it
            array[tempIndex] = array[i];
            tempIndex++;

        }
        //update the last index in place of tempIndex so that we don't miss the last element
        array[tempIndex] = array[arrayLength - 1];
        return ++tempIndex;

    }

}
