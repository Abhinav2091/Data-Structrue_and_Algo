package com.luv2code.logicmojo;

import javax.swing.*;
import java.util.Arrays;

public class MergeSort {

    public static void main(String ar[]) {
        int array[] = {8, 4, 3, 12, 25, 6, 13, 10};
        int startIndex = 0;
        int lastIndex = array.length - 1;

        //call the method here
        divide(array, startIndex, lastIndex);
        //print the sorted array
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    //{8, 4, 3, 12, 25, 6, 13, 10}, 0, 7
    static void divide(int[] array, int startIndex, int lastIndex) {
        //use temp array to store sorted value
        int[] tempArray = new int[array.length];
        int midIndex = (startIndex + lastIndex) / 2;//3 //1 //0
        //not valid
        if (startIndex == lastIndex)
            return;

        //do left side divide
        divide(array, startIndex, midIndex);//0,3 //0,1 //0,0

        //do right side divide
        divide(array, midIndex + 1, lastIndex); //1,1

        // call the merge method now
        merge(array, tempArray, startIndex, midIndex, lastIndex);//0,0,1

    }

    static void merge(int[] array, int[] tempArray, int startIndex, int midIndex, int lastIndex) {//0,0,1

        //for temp array copy
        int i = startIndex;
        int indexForTempArray = startIndex;//0
        int midIndexForRightSide = midIndex + 1;//1
        //0<=0 1<=1

        while (startIndex <= midIndex && (midIndexForRightSide) <= lastIndex) {

            //{8, 4, 3, 12, 25, 6, 13, 10}

            if (array[startIndex] <= array[midIndexForRightSide]) {
                tempArray[indexForTempArray++] = array[startIndex++];

            } else {
                tempArray[indexForTempArray++] = array[midIndexForRightSide++];
                //temp[0]=4,
            }
        }

        //if we go into else part of above code we need to copy left part to remaining temp array
        while (startIndex <= midIndex) {
            tempArray[indexForTempArray++] = array[startIndex++];
            //temp[1]=8,
        }
        //if we go into If part of above code we need to copy right part to remaining temp array
        while (midIndexForRightSide <= lastIndex) {
            tempArray[indexForTempArray++] = array[midIndexForRightSide++];
        }
/*
        System.out.print("Before merging ");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println("After merging ");
        for (int arr : tempArray) {
            System.out.print(arr + " ");
        }
        System.out.println();

 */
        //now copy the temp array to original array
        for (; i <= lastIndex; i++) {
            array[i] = tempArray[i];
        }
        /*System.out.print("After merging ");
        for (int arr : array) {
        }
*/
        //{4, 8, 3, 12, 25, 6, 13, 10}


    }


}
