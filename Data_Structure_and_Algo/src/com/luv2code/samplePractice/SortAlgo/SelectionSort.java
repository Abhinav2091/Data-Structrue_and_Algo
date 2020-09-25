package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;
//Time complexity O(n2) //quadratic
//not a stable algo

//get the index of largest number and swap it at the end of the loop to the end location
public class SelectionSort {

    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        //first loop will start from end so when we came out from inner loop the last element in array is in sorted position
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            //inner loop will compare the element and the largest number index in array will get swapped by last index
            //hence last value will be in sorted position
            //let consider large index to be ) for starting
            int largeIndex = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largeIndex])
                    largeIndex = i;
            }
            Utility.swap(array, largeIndex, lastUnsortedIndex);
        }
        Utility.show(array);

    }

}
