package com.luv2code.logicmojo.Arrays;

/*
One array of integers is given as an input ,
which is initially increasing and then decreasing
or it can be only increasing or decreasing ,
you need to find the maximum value in the array in O(Log n) Time complexity and O(1) Space Complexity Asked in :
 */
public class Assignment0_1 {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int n = array.length;
        System.out.println("The maximum Value " + findMaximum(array, 0, n - 1));
    }

    static int findMaximum(int array[], int start, int end) {

        //Only one element is present in array[start..end]
        if (start == end)
            return array[start];
        // If there are two elements and first is greater then the first element is maximum
        if ((end == start + 1))
        {
            if(array[start] >= array[end])
                return array[start];
            else //If there are two elements and second is greater then the second element is maximum
                return array[end];
        }
        //we have three cases here
        //1.left side is less right side is greater // mean asending
        //2.right side is less left is greater // means desending
        //both left and right is less mean highest number

        //using binary search here
        int mid = (start + end) / 2;

        if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1])
            return array[mid];
        //{120, 100, 80, 20, 0}
       if (array[mid] > array[mid - 1] && array[mid] < array[mid + 1])
            return findMaximum(array, mid+1, end);
        else
           return findMaximum(array, start, mid-1);

    }
}
