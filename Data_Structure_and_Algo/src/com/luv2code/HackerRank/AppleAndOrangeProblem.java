package com.luv2code.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrangeProblem {

    public static void main(String ar[]) {

        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);

        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);
        countApplesAndOranges(7, 11, 5, 15,apples,oranges);
    }

    /**
     * @param s       == start value of House
     * @param t       == end value of house
     * @param a       == place of apple tree
     * @param b       == place of orange tree
     * @param apples  == number of apples with place they fell
     * @param oranges == number od oranges with place they fell
     */
    private static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int noOfValidApples = 0;
        int noOfValidOranges = 0;
        // Write your code here
        for (Integer apple : apples) {
            int appleFromTree = a + apple;
            if (appleFromTree >= s && appleFromTree <= t)
                noOfValidApples++;
        }

        for (Integer orange : oranges) {
            int orangeFromTree = b + orange;
            if (orangeFromTree >= s && orangeFromTree <= t)
                noOfValidOranges++;
        }
        System.out.println(noOfValidApples);
        System.out.println(noOfValidOranges);


    }

}


