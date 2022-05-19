package com.luv2code.logicmojo.Arrays;

/**
 * Note colum can be greater than row but in case of row is greater than colum it fails
 */
public class Matrix_Assignment_1_1 {
    public static int m, n;

    private static void diagonalPrint(int matrix[][], int row, int column) {

        int rowStart = 0;
        int rowEnd = row - 1;
        int columnStart = 0;
        int columnEnd = column - 1;
        //first loop will run for half diagnol part
        for (; rowStart <= rowEnd; rowStart++) {
            int i = rowStart;
            int j = columnStart;
            //inter loop
            while (i >= 0) {
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }

            System.out.println();
        }
        //second loop for remaing part
        for (; columnStart <= rowEnd; columnStart++) {
            int i = rowEnd;
            int j = columnStart + 1;
            while (j <= rowEnd) {
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4,5,6},
                {7,8,9},
                };

        m = matrix.length;
        n = matrix[0].length;

        diagonalPrint(matrix, m, n);
    }

}
