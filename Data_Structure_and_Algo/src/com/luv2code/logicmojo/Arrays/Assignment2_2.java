package com.luv2code.logicmojo.Arrays;

public class Assignment2_2 {
    static int removeDuplicates(int array[], int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1])
                array[count++] = array[i];

        }

        array[count++] = array[n - 1];
        return count;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = array.length;

        n = removeDuplicates(array, n);

        System.out.println(n);
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }

}
