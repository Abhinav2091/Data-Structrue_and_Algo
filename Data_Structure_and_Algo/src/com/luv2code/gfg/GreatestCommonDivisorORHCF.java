package com.luv2code.gfg;

public class GreatestCommonDivisorORHCF {
    public static void main(String ar[]) {
        int a = 15;
        int b = 12;
        System.out.println(greatestDivisor(a, b));
        System.out.println(EuclidAlgo(a, b));
        System.out.println(OptimisedEuclidAlgo(a, b));
    }

    private static int greatestDivisor(int a, int b) {
        int minimumNo = Math.min(a, b);
        for (int i = minimumNo; i > 0; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return -1;
    }

    private static int EuclidAlgo(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    private static int OptimisedEuclidAlgo(int a, int b) {
        if (b == 0)
            return a;
        else
            return OptimisedEuclidAlgo(b, a % b);
    }
}
