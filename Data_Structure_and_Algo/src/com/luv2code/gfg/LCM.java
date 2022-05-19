package com.luv2code.gfg;

public class LCM {
    public static void main(String ar[]) {
        int a = 4;
        int b = 6;
        System.out.println(lcm(a, b));
        System.out.println(OptimisedLCM(a, b));

    }

    private static int lcm(int a, int b) {
        int maxNumber = Math.max(a, b);

        for (int i = maxNumber; i > 0; i++) {
            if (i % a == 0 && i % b == 0)
                return i;
        }
        return -1;
    }

    //find hcf first using Euclidean also
    private static int HCF(int a, int b) {
        if (b == 0)
            return a;
        else
            return HCF(b, a % b);
    }

    private static int OptimisedLCM(int a, int b) {
        int hcf = HCF(a, b);
        return (a * b) / hcf;

    }
}
