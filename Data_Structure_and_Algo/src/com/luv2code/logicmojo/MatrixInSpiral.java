package com.luv2code.logicmojo;

/**
 * you are given a matrix of m x n elements (m rows, n columns),
 * Print all elements of the matrix in spiral order in O(m*n) Time Complexity and O(1) Space Complexity
 * <p>
 * <p>
 *
 */

public class MatrixInSpiral {
    public static void main(String ar[]) {

        int matrix[][] = {{1, 2, 3, 7, 3, 456},
                {4, 5, 6, 16, 33, 44},
                {7, 8, 9, 0, 333, 444},
                {17, 18, 19, 56, 3333, 4444}
        };
        int noOfRow = matrix.length;
        int noOfColumn = matrix[0].length;
        spiralPrint(noOfRow, noOfColumn, matrix);
    }

    static void spiralPrint(int noOfRow, int noOfColumn, int[][] matrix) {

        int initialRowIndex = 0;
        int lastRowIndex = noOfColumn - 1;
        int initialColumnIndex = 0;
        int lastColumnIndex = noOfRow - 1;
        int row = 0;
        int column = 0;
        //outer for loop so that once the outer layer of matrix is print i went inside
        while (initialRowIndex < lastRowIndex && initialColumnIndex < lastColumnIndex) {

            //1st for loop to print first row values
            for (int i = column; i < lastRowIndex; i++, column++) {
                System.out.print(matrix[row][column] + " ");
            }

            //2nd for loop to print last column values
            for (int i = row; i < lastColumnIndex; i++, row++) {
                System.out.print(matrix[row][column] + " ");
            }
            //3rd for loop to print last row values in reverse
            for (int i = column; i > initialColumnIndex; i--, column--) {
                System.out.print(matrix[row][column] + " ");
            }
            //4rth for loop to print last column values in reverse
            for (int i = lastColumnIndex; i > initialRowIndex; i--, row--) {
                System.out.print(matrix[row][column] + " ");
            }
            initialRowIndex++;
            lastRowIndex--;
            initialColumnIndex++;
            lastColumnIndex--;
            column++;
            row++;
            //to put the last value for odd array
            if (initialRowIndex == lastRowIndex && initialColumnIndex == lastColumnIndex) {
                System.out.print(matrix[initialRowIndex][initialColumnIndex]);
            }


        }
    }

}
