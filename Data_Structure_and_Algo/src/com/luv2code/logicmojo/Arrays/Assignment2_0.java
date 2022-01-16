package com.luv2code.logicmojo.Arrays;

public class Assignment2_0 {
    private static int Jump(int[] num) {
        int jumpCount = 1;
        int step = num[0];
        int maxVal = num[0];


        for (int i = 1; i < num.length - 1; i++) {
            step--;
            maxVal--;
            if (maxVal < num[i])
                maxVal = num[i];

            if (step == 0) {
                jumpCount++;
                step = maxVal;
                if (maxVal == 0)
                    return -1;
            }
        }

        return jumpCount;
    }

    public static void main(String[] args) {
        int num[] = {3, 2, 1, 0, 4};

        System.out.println("Minimum number of jumps to reach end is : "
                + Jump(num));
    }
}
