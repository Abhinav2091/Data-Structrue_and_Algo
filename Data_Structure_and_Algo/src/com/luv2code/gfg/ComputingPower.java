package com.luv2code.gfg;

public class ComputingPower {
    public static void main(String ar[]) {
        int a = 3;
        int b = 5;
        System.out.println(getComputedValue(a, b));
        System.out.println(getComputedValueOptimized(a, b));

    }

    private static int getComputedValue(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;

    }

    private static int getComputedValueOptimized(int a, int b) {
        if (b == 0)
            return 1;
        int temp = getComputedValueOptimized(a, b / 2);
        temp = temp * temp;
        if (b % 2 == 0)
            return temp;
        else
            return temp * a;
    }


}
