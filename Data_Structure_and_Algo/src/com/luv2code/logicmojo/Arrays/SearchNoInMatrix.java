package com.luv2code.logicmojo.Arrays;

/**
 * Matrix n*n is given, where all elements in any individual row or column are sorted.
 * In such a matrix, we have to find the position of a value in O(n) Time Complexity and O(1) Space Complexity
 */
public class SearchNoInMatrix {
    public static void main(String[] ar) {
        int[][] matrix = {{10, 20, 30, 40},
                {15, 25, 36, 46},
                {28, 29, 37, 48},
                {32, 33, 39, 50}};

        boolean result = searchElement(matrix, 4, 38);
        System.out.println(result);
    }

    private static boolean searchElement(int[][] matrix, int N, int value) {
        //so her we run the while loop untill we find the number if not
        // we came out of loop and return false
        int i = 0, j = 0;
        while (i < N && j >= 0) {
            if (matrix[i][j] == value)
                return true;
            //if value is greater that mean  all the elemt on left are greater
            // and all the element on bottom are also greater
            if (matrix[i][j] > value)
                j--;
                //else all value on let and bottom are smaller
            else
                i++;

        }
        return false;
    }

}
