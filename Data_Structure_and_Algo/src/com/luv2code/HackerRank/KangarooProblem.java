package com.luv2code.HackerRank;

/**
 * You are choreographing a circus show with various animals. For one act,
 * you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
 * <p>
 * The first kangaroo starts at location  and moves at a rate of  meters per jump.
 * The second kangaroo starts at location  and moves at a rate of  meters per jump.
 * You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.
 * If it is possible, return YES, otherwise return NO.
 */

public class KangarooProblem {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] ar) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        System.out.println(kangaroo(x1, v1, x2, v2));
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {

        //velocity of kangaro 2 should be greater than kangaroo 1 to reach at same point
        if (v1 > v2) {
            int remainder = (x2 - x1) % (v1 - v2);
            return remainder == 0 ? YES : NO;

        }
        return NO;

    }

}
