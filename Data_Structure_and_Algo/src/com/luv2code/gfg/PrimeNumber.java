package com.luv2code.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    public static void main(String ar[]) {
        int a = 15;
        System.out.println(isPrime(a));
        System.out.println(isPrimeEfficientSol(a));
        System.out.println(isPrimeMoreEfficientSol(a));
        System.out.println(getAllPrimeNumber(a));
        System.out.println(sieveAlgo(a));
        System.out.println(optimizedSieveAlgo(a));
    }

    private static List<Integer> sieveAlgo(int number) {
        boolean[] tempArray = new boolean[number + 1];
        Arrays.fill(tempArray, Boolean.TRUE);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 2; i * i <= number; i++) {
            if (tempArray[i]) {
                for (int j = 2 * i; j <= number; j = j + i) {
                    tempArray[j] = false;
                }
            }
        }

        for (int i = 2; i < tempArray.length; i++) {
            if (tempArray[i])
                resultList.add(i);
        }
        return resultList;
    }

    //time complexity is same just code length is reduced
    private static List<Integer> optimizedSieveAlgo(int number) {
        boolean[] tempArray = new boolean[number + 1];
        Arrays.fill(tempArray, Boolean.TRUE);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (tempArray[i]) {
                resultList.add(i);
                for (int j = i * i; j <= number; j = j + i) {
                    tempArray[j] = false;
                }
            }
        }

        return resultList;
    }


    private static List<Integer> getAllPrimeNumber(int number) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (isPrimeEfficientSol(i))
                resultList.add(i);
        }
        return resultList;
    }

    private static boolean isPrime(int a) {

        //as 1 is not prime no
        if (a <= 1)
            return false;
        for (int i = a / 2; i > 1; i--) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isPrimeEfficientSol(int a) {

        if (a == 1)
            return false;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isPrimeMoreEfficientSol(int a) {

        if (a == 1)
            return false;
        if (a == 2 || a == 3)
            return true;
        if (a % 2 == 0 || a % 3 == 0)
            return false;

        for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (a + 2) == 0)
                return false;
        }
        return true;
    }
}
