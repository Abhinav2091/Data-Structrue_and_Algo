package com.luv2code.JAVA.functions;

import java.util.Arrays;

/**
 * for natural order comparision
 */
public class ComparableUse implements Comparable<ComparableUse> {
    public int a;
    public int b;

    ComparableUse() {
    }


    ComparableUse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(ComparableUse o) {
        return this.a - o.a;
    }

    @Override
    public String toString() {
        return "ComparableUse{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class Test {


    public static void main(String ar[]) {
        ComparableUse[] arr = {new ComparableUse(4, 21),
                new ComparableUse(1, 77), new ComparableUse(2, 90)};
        Arrays.sort(arr);

        for (ComparableUse cu : arr)
            System.out.println(cu);
    }

}
