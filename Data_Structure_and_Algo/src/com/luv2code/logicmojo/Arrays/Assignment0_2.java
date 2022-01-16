package com.luv2code.logicmojo.Arrays;

/*
We rotate an ascending order sorted array at some point unknown to user. So for instance, 3 4 5 6 7 might become 5 6 7 3 4.
Modify binary search algorithm to find an element in the rotated array in O(log n) time and O(1) Space complexity
 */
public class Assignment0_2 {

    static int findNumber(int array[], int start, int end, int value)
    {
        if(start>end)
            return -1;
        int mid=(start+end)/2;
       // System.out.println(mid);
        if(array[mid]==value)
            return mid;
        //check for the sorted array
        if(array[mid]>=array[start])
        {
            if(value>=array[start] && value<array[mid])
                return findNumber(array,start,mid-1,value);
            else
                return findNumber(array,mid+1,end,value);
        }
       // we need to find in rotating array
        else
        {
            if(value>=array[mid] && value<=array[end])
                return findNumber(array,mid+1,end,value);

            else
                return findNumber(array,start,mid-1,value);
        }


    }
    

    public static void main(String args[])
    {
        int array[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = array.length;
        int value = 3;
        int i = findNumber(array, 0, n - 1, value);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Value not found");
    }
}
