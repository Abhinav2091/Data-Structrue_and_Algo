package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;

public class Assignment1_1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        Sort012(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


    public static void Sort012(int[] array, int end) {

        int start=0;
        int mid=0;
        while(mid<=end)
        {
          if(array[mid]==0) {
              swap(array,array[mid],array[start],mid,start);
              start++;
              mid++;
          }
          else if(array[mid]==2)
          {
              swap(array,array[mid],array[end],mid,end);
              end--;
          }
          else
              mid++;
        }
    }
    public static void swap(int [] array,int no1,int no2,int index1,int index2)
    {
        array[index1]=no2;
        array[index2]=no1;
    }

}
