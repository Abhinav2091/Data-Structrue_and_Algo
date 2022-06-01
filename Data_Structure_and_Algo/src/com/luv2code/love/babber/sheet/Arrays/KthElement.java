package com.luv2code.love.babber.sheet.Arrays;

import java.util.Arrays;

/**
 * Find the "Kth" max or min element of an array
 * 1.approch using merge sort
 */
public class KthElement {
    public static void main(String ar[]) {

        int kthNo = 3;
        // int arr[] = {8, 4, 3, 12, 25, 6, 13, 10};
        //int arr[] = {12, 11, 13, 5, 6, 7};
        // int arr[] = {3, 4, 8, 12, 6, 25, 10, 13};

        //int arr[]={0,0,3,8,10,11,4,7,9,10};

        //int arr[] = {4, 6, 3, 8, 25, 12, 13, 10};
        int arr[] = {10, 5, 13, 12};
        //  System.out.println(byUsingSorting(kthNo,arr));
        System.out.println(byUsingQuickSelectAlgo(kthNo, arr, 0, arr.length - 1));


    }

    private static int byUsingQuickSelectAlgo(int kthNo, int[] arr, int start, int end) {

        int pivotIndex = lomutoAlgo(arr, start, end);
        //for smallest
       // if (pivotIndex > kthNo - 1)
        //for largest()
        if (pivotIndex > arr.length - kthNo)
        {
            //System.out.println("leftarry:" + start + "::" + (pivotIndex - 1));
            return byUsingQuickSelectAlgo(kthNo, arr, start, pivotIndex - 1);
        }
        //for smallest
       // else if (pivotIndex < kthNo - 1)
            //for largest()
        else if (pivotIndex < arr.length - kthNo)
        {
            // System.out.println("right arry:" + (pivotIndex +1) + "::" + end);
            return byUsingQuickSelectAlgo(kthNo, arr, pivotIndex + 1, end);
        } else
            return arr[pivotIndex];


    }

    private static int lomutoAlgo(int[] arr, int start, int end) {
        int startIndex = start;
        int pivotIndex = (int)(Math.random()*(end-start+1)+start);
        int pivotVal = arr[pivotIndex];
        swap(arr,end,pivotIndex);
        for (int i = start; i < end; i++) {
            if (arr[i] < pivotVal)
                swap(arr, i, startIndex++);
        }
        swap(arr, end, startIndex);
        // System.out.println(Arrays.toString(arr) + "::" + startIndex);
        return startIndex;
    }

    private static void swap(int[] arr, int i, int startIndex) {
        int temp = arr[i];
        arr[i] = arr[startIndex];
        arr[startIndex] = temp;
    }

    private static int byUsingSorting(int kthNo, int arr[]) {

        int[] tempArr = new int[arr.length];
        // mergeValue(arr,tempArr,0,3,1);
        //divide(arr, 0, arr.length - 1);
        divide(arr, tempArr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        return arr[kthNo - 1];
    }


    public static void divide(int[] arr, int[] tempArr, int start, int end) {
        if (start == end)
            return;
        int mid = (start + end) / 2;
        divide(arr, tempArr, start, mid);
        divide(arr, tempArr, mid + 1, end);
        mergeValue(arr, tempArr, start, end, mid);
    }

    public static void divide(int[] arr, int start, int end) {
        if (start == end)
            return;
        int mid = (start + end) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        mergeValue(arr, start, end, mid);
    }


    private static void mergeValue(int[] arr, int[] tempArr, int start, int end, int mid) {
        int startIndex = start;
        int midIndex = mid + 1;
        int temArrStartIndex = start;
        while (startIndex <= mid && midIndex <= end) {
            if (arr[startIndex] > arr[midIndex])
                tempArr[temArrStartIndex++] = arr[midIndex++];
            else
                tempArr[temArrStartIndex++] = arr[startIndex++];
        }

        while (startIndex <= mid) {
            tempArr[temArrStartIndex++] = arr[startIndex++];
        }
        while (midIndex <= end) {
            tempArr[temArrStartIndex++] = arr[midIndex++];
        }
        //  System.out.println(Arrays.toString(tempArr));
        for (int i = start; i <= end; i++) {
            arr[i] = tempArr[i];
        }
        //System.out.println(Arrays.toString(arr));

    }

    private static void mergeValue(int[] arr, int start, int end, int mid) {

        int[] leftArray = new int[mid - start + 1];
        int[] rightArray = new int[end - mid];
        int midIndex = mid + 1;
        int leftArrStartIndex = 0;
        int rightArrStartIndex = 0;
        int starIndex = start;
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = arr[starIndex++];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = arr[midIndex++];
        }


        while (leftArrStartIndex < leftArray.length && rightArrStartIndex < rightArray.length) {
            if (leftArray[leftArrStartIndex] >= rightArray[rightArrStartIndex]) {
                arr[start++] = rightArray[rightArrStartIndex];
                rightArrStartIndex++;
            } else {
                arr[start++] = leftArray[leftArrStartIndex];
                leftArrStartIndex++;
            }
        }

        while (leftArrStartIndex < leftArray.length) {
            arr[start++] = leftArray[leftArrStartIndex++];
        }
        while (rightArrStartIndex < rightArray.length) {
            arr[start++] = rightArray[rightArrStartIndex++];
        }


    }


}
