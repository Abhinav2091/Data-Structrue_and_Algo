package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;

/**
 * You are given a square matrix, You need to rotate the matrix in a clockwise direction by 90 degrees
 * in Time Complexity O(m*n) and No Extra Space i.e O(1)
 * <p>
 * NOTE:: This approach will only work if rows and column are equal
 */
public class RotateMatrixClockWise {
    public static void main(String[] ar) {
        int[][] inputMatrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        //as we can perform this operation on square matrix only
        int sizeOfMatrix = inputMatrix.length;
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*********************");
        matrixRotation(inputMatrix, sizeOfMatrix);
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void matrixRotation(int[][] inputMatrix, int sizeOfMatrix) {
        //so we will start from outer loop and we will
        //perfom iteration till we reach half of Matrix that mean we swapped the layer and we dont need to go further
        for (int i = 0; i < sizeOfMatrix / 2; i++) {
            //now the inner loop will perform the swapping on layers
            for (int j = i; j < sizeOfMatrix - i - 1; j++) {
                int temp = inputMatrix[j][sizeOfMatrix - i - 1];

                inputMatrix[j][sizeOfMatrix - i - 1] = inputMatrix[i][j];

                inputMatrix[i][j] = inputMatrix[sizeOfMatrix - 1 - j][i];

                inputMatrix[sizeOfMatrix - j - 1][i] = inputMatrix[sizeOfMatrix - i - 1][sizeOfMatrix - j - 1];

                inputMatrix[sizeOfMatrix - i - 1][sizeOfMatrix - j - 1] = temp;


            }
        }

    }

}
