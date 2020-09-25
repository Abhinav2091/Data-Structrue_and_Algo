package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

//in insertion sort we shift the unsorted index value to its sorted position in array
//time complexity O(n2) ////quadratic
public class InsertionSorting {

    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        //let consider 0 position as sorted for initial stage
        //so all on right is unsorted array
        int firstSortedIndex = 0;
        //not lets compare first element of unsorted array and shift it to its position in sorted array
        //so first loop will start from unsorted index till the end and hence at the end all will be in sorted position
        for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            int newElement = array[unsortedIndex];
            //the inner loop will check that unsorted value with all sorted value and once it find it place we will increment the unsorted index
            for (firstSortedIndex = unsortedIndex; firstSortedIndex > 0 && array[firstSortedIndex - 1] > newElement; firstSortedIndex--) {
                array[firstSortedIndex] = array[firstSortedIndex - 1];
            }
            array[firstSortedIndex] = newElement;
        }


        Utility.show(array);
    }

}
