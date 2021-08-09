package com.luv2code.logicmojo.Arrays;

/**
 * Given a matrix of M x N elements (M rows, N columns),
 * Print all elements of the matrix in diagonal order in Time Complexity O(m*n) and Space Complexity O(1)
 */
public class PrintMatrixDiagonally {

    public static void main(String[] ar) {
        int matrix[][] = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},};

        int rows = matrix.length;
        int columns = matrix[0].length;

        diagonalPrint(matrix, rows, columns);
    }

    private static void diagonalPrint(int[][] matrix, int rows, int columns) {

        int i = 0, j = 0;
        //so here we divide the matrix into two part first we print the half dignol portion
        //starting from 1st row ends at last row
        for (int k = i; k < rows; k++) {
            //in this case we need to decrement the row and increment the column to print dignol value
            i = k;
            j = 0;
            while (i >= 0) {
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;//0//1

            }
            System.out.println();


        }


        //then the second dignal start from 1+column till last column

        for (int k = 1; k < columns; k++) {
            //in this case we need to decrement the row and increment the column to print dignol value
            i = rows - 1;
            j = k;
            while (j < columns) {
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;

            }
            System.out.println();


        }


    }
}
