package com.luv2code.love.babber.sheet.Arrays;

import java.util.Arrays;

/**
 * Given an array (or string), the task is to reverse the array/string.
 * Examples :
 * <p>
 * <p>
 * Input  : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 * <p>
 * Input :  arr[] = {4, 5, 1, 2}
 * Output : arr[] = {2, 1, 5, 4}
 */
public class ReverseArray {
    public static void main(String ar[]) {
        int inputArray[] = {4, 5, 1, 2,7,24,13};
       // System.out.println(Arrays.toString(brutForceSol(inputArray)));
        System.out.println(Arrays.toString(optimisedApproach(inputArray)));
        // System.out.println(Arrays.toString(recursiveWay(inputArray,0,inputArray.length-1)));
    }

    private static int[] optimisedApproach(int[] inputArray) {
        int startIndex=0;
        int endIndex=inputArray.length-1;
        while (startIndex<endIndex){
            int tempVal = inputArray[startIndex];
            inputArray[startIndex] = inputArray[endIndex];
            inputArray[endIndex] = tempVal;
            ++startIndex;
            --endIndex;
        }
        return inputArray;
    }

    private static int[] recursiveWay(int[] inputArray, int startIndex,int endIndex) {
        if(startIndex>endIndex)
            return inputArray;
        int tempVal=inputArray[startIndex];
        inputArray[startIndex]=inputArray[endIndex];
        inputArray[endIndex]=tempVal;
        return recursiveWay(inputArray,++startIndex,--endIndex);

    }

    private static int[] brutForceSol(int[] inputArray) {
        int[] finalArray = new int[inputArray.length];
        int arrLength = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            finalArray[arrLength - i] = inputArray[i];
        }
        return finalArray;
    }

}
