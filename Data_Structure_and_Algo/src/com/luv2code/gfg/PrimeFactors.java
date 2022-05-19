package com.luv2code.gfg;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String ar[]) {
        int a = 80;
        System.out.println(getFactorials(a));
        System.out.println(getFactorialsOptimalSolution(a));


    }

    private static boolean isPrime(int number) {

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private static List<Integer> getFactorials(int number) {
        List<Integer> resultList = new ArrayList<Integer>();

        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                int x = i;
                while (number % x == 0) {
                    resultList.add(i);
                    x = x * i;
                }
            }
        }
        return resultList;
    }

    private static List<Integer> getFactorialsOptimalSolution(int number) {
        List<Integer> resultList = new ArrayList<Integer>();
        if (number < 2) {
            resultList.add(-1);
            return resultList;
        }

        for (int i = 2; i * i <= number; i++) {
            while (number % i == 0) {
                resultList.add(i);
                number = number / i;
            }
            //for last prime number
            if (number > 1)
                resultList.add(number);
        }

        return resultList;
    }


}
