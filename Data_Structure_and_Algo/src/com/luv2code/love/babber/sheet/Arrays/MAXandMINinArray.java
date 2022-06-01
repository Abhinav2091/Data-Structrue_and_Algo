package com.luv2code.love.babber.sheet.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Maximum and minimum of an array using minimum number of comparisons
 */
public class MAXandMINinArray {
    public static void main(String ar[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        System.out.println(bruteForce(arr));
        Map<String, Integer> resultMap = new HashMap<>(2);
        resultMap.put("MIN", arr[0]);
        resultMap.put("MAX", arr[0]);
        System.out.println(tournamentMethod(resultMap, arr, 0, arr.length - 1));
    }

    private static Map<String, Integer> bruteForce(int[] arr) {
        Map<String, Integer> resultMap = new HashMap<>(2);
        resultMap.put("MIN", arr[0]);
        resultMap.put("MAX", arr[0]);
        for (int tempArray : arr) {
            if (resultMap.get("MIN") > tempArray)
                resultMap.put("MIN", tempArray);
            else if (resultMap.get("MAX") < tempArray)
                resultMap.put("MAX", tempArray);

        }
        return resultMap;
    }

    private static Map<String, Integer> tournamentMethod(Map<String, Integer> resultMap, int[] arr, int startIndex, int endIndex) {
        int midIndex = (startIndex + endIndex) / 2;

        if (startIndex == endIndex) {
            return resultMap;
        }
        if (startIndex == endIndex - 1) {
            if (resultMap.get("MIN") > arr[startIndex])
                resultMap.put("MIN", arr[startIndex]);
            else if (resultMap.get("MAX") < arr[startIndex])
                resultMap.put("MAX", arr[startIndex]);

            if (resultMap.get("MIN") > arr[endIndex])
                resultMap.put("MIN", arr[endIndex]);
            else if (resultMap.get("MAX") < arr[endIndex])
                resultMap.put("MAX", arr[endIndex]);

        }
        tournamentMethod(resultMap,arr,startIndex,midIndex);
        tournamentMethod(resultMap,arr,midIndex+1,endIndex);
        return resultMap;
    }
}

