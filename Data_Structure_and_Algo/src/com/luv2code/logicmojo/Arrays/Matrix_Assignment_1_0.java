package com.luv2code.logicmojo.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Matrix_Assignment_1_0 {
    static void spiralPrint(int row, int column, int matrix[][]) {
        // List<Integer> resultPrint = new ArrayList<>(row * column);
        int rowStart = 0;
        int rowEnd = row - 1;
        int columnStart = 0;
        int columnEnd = column - 1;

        int count = 0;
        //outer for loop till i reach the center
        while (rowStart < row && columnStart < column) {
            for (int j = columnStart; j <= columnEnd; j++) {
                System.out.print(matrix[rowStart][j] + " ");

            }
            //System.out.println();
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][columnEnd] + " ");
            }
            // System.out.println();
            columnEnd--;
            for (int j = columnEnd; j >= columnStart; j--) {
                System.out.print(matrix[rowEnd][j] + " ");

            }
            // System.out.println();


            for (int i = columnEnd; i > columnStart; i--) {
                System.out.print(matrix[i][columnStart] + " ");
            }
            // System.out.println();


            rowEnd--;
            columnStart++;

            count++;
        }
    }


    public static void main(String[] args) {
        int R = 5;
        int C = 5;
        int matrix[][] = {{1, 2, 3, 24, 0},
                {4, 5, 6, 35, 56},
                {7, 8, 9, 56, 78},
                {77, 88, 99, 556, 778},
                {7777, 8888, 9999, 5556, 7778}};

        spiralPrint(R, C, matrix);
    }
}
