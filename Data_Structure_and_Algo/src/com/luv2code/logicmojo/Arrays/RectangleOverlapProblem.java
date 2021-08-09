package com.luv2code.logicmojo.Arrays;

/**
 * Rectangle that is represented as a list [x1, y1, x2, y2],
 * where (x1, y1) is the coordinates of its top-left corner,
 * and (x2, y2) is the coordinates of its bottam-right corner.
 * Now two rectangles overlap if the area of their intersection is positive.
 * Two rectangles that only touch at the corner or edges do not overlap.Check in O(1)
 * Time complexity and O(1) Space complexity that both rectangle overlap or not Asked in
 */


public class RectangleOverlapProblem {
    public static void main(String ar[]) {
        Coordinates S = new Coordinates(), P = new Coordinates(), S1 = new Coordinates(), P1 = new Coordinates();
        S.x = 0;
        S.y = 8;
        P.x = 8;
        P.y = 0;
        S1.x = 20;
        S1.y = 30;
        P1.x = 30;
        P1.y = 20;
        System.out.println(isOverlapped(S, P, S1, P1));

    }

    static boolean isOverlapped(Coordinates S, Coordinates P, Coordinates S1, Coordinates P1) {

        //If one rectangle is on left side of other
        if (S.x >= P1.x || S1.x >= P.x) {
            return false;
        }
        //If one rectangle is above other
        return S.y > P1.y && S1.y > P.y;
    }
}

class Coordinates {
    int x, y;
}
