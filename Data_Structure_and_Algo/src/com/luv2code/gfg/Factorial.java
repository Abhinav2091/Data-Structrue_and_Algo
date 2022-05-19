package com.luv2code.gfg;

public class Factorial {
    public static void main(String ar[]) {
        long number = 5;
        System.out.println(factorialOfNumber(number));
        System.out.println(factorialNumber(number));
        System.out.println(trailingZero(factorialNumber(number)));
        System.out.println(trailingZeroWithoutFactorial(251));


    }

    private static long factorialNumber(long number)
    {
        for(long i=number;i>1;i--)
        {
            number = number*(i-1);
        }
        return number;
    }
    private static long factorialOfNumber(long number) {
        if (number == 1)
            return 1;
        return number*factorialOfNumber(number-1);
    }

    private static int trailingZero(long factorialNumber)
    {
        int noOfZero=0;
        while(factorialNumber%10==0)
        {
            factorialNumber=factorialNumber/10;
            noOfZero++;
        }
        return noOfZero;
    }

    private static long trailingZeroWithoutFactorial(long factorialNumber)
    {
        long noOfZero=0;
       for(int i=5;i<=factorialNumber;i=i*5)
       {
           noOfZero=noOfZero+(factorialNumber/i);
       }
       return noOfZero;
    }
}
