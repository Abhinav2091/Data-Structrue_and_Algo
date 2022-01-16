package com.luv2code.logicmojo.Arrays;

public class Assignment1_2 {
    public static void main (String[] args)
    {
        int array[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = array.length;
        MoveZeroToEnd(array, n);
        System.out.println("result is: ");
        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
    }
    static void MoveZeroToEnd(int array[], int n)
    {
        int start=0;
        int tempIndex=0;

        while(tempIndex<=n-1)
        {
            if (array[tempIndex] != 0) {
                swap(array, array[start], array[tempIndex], start, tempIndex);
                start++;
            }
            tempIndex++;
        }
    }

    public static void swap(int [] array,int no1,int no2,int index1,int index2)
    {
        array[index1]=no2;
        array[index2]=no1;
    }
}
