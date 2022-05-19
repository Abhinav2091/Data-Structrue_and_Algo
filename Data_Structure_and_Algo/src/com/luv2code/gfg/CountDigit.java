package com.luv2code.gfg;

public class CountDigit {
    public static void main(String ar[])
    {
        int number=9235;
        System.out.println(iterationMethod(number));
        System.out.println(recursionMethod(number));
    }

    private static int recursionMethod(int number) {
        if(number==0)
            return 0;
        return 1+recursionMethod(number/10);
    }

    private static int iterationMethod(int number) {
        int count=0;
        while(number!=0)
        {
            number=number/10;
            count++;
        }
        return count;

    }
}
