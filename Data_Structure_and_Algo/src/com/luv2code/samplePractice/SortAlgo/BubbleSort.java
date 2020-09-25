package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;
//Time complexity O(n2) //quadratic

//swap the biggest number to next and eventually the biggest number will be at end
public class BubbleSort {

    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        //first loop will start from end so when we came out from inner loop the last element in array is in sorted position
        for (int unsortedIndex = array.length - 1; unsortedIndex > 0; unsortedIndex--) {
            //this inner array will compare element with next element till unsorted Index so we will swap and put larger value at end
            for (int i = 0; i < unsortedIndex; i++) {
                if (array[i] > array[i + 1])
                    Utility.swap(array, i, i + 1);
            }


        }


        Utility.show(array);


    }



}
