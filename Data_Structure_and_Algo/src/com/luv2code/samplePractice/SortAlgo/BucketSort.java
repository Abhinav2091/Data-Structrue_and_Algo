package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class BucketSort {
    public static void main(String ar[]) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};
        bucketSort(intArray);
        Utility.show(intArray);
    }

    private static void bucketSort(int[] intArray) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < intArray.length; i++) {
            //insert value in array list on the bases of the once index
            //so we get all the previous bucket element smaller than the next on
            //scattering phase
            buckets[hash(intArray[i])].add(intArray[i]);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        //gathering phase
        //outer loop will traverse the list
        for (int i = 0; i < buckets.length; i++) {
            //the inner loop will traverse the array list
            for (int value : buckets[i]) {
                intArray[j++] = value;
            }

        }

    }

    private static int hash(int value) {
        return value / 10;
    }
}
