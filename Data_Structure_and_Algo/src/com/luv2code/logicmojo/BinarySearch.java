package com.luv2code.logicmojo;

public class BinarySearch {
    /**
     * Binary Search will be performed on
     * Sorted array
     * <p>
     * Time complexity in O(Log nj)
     *
     * @param ar
     */
    public static void main(String ar[]) {
        int[] inputArray = {2, 5, 6, 8, 9, 10};
        int key = 5;
        int startIndex = 0;
        int lastIndex = inputArray.length - 1;

        int resultIndex = binarySearch(inputArray, startIndex, lastIndex, key);

        if (resultIndex != -1)
            System.out.println("Index of the key =" + key + " is " + resultIndex);
        else
            System.out.println("No index found for key " + key);

    }

    static int binarySearch(int array[], int startIndex, int lastIndex, int key) {
        if (startIndex > lastIndex)
            return -1;

        int dividedIndex = (startIndex + lastIndex) / 2;

        if (array[dividedIndex] == key)
            return dividedIndex;
        else if (array[dividedIndex] > key)
            return binarySearch(array, startIndex, dividedIndex - 1, key);
        else
            return binarySearch(array, dividedIndex + 1, lastIndex, key);


    }

}
