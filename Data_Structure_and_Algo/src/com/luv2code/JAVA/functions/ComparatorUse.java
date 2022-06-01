package com.luv2code.JAVA.functions;

import java.util.Arrays;
import java.util.Comparator;


class ToUse {
    public int a;
    public int b;

    ToUse() {
    }

    ;

    ToUse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "ToUse{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

public class ComparatorUse implements Comparator<ToUse> {


    @Override
    public int compare(ToUse o1, ToUse o2) {
        return o2.a - o1.a;
    }
}

class Test2 {


    public static void main(String ar[]) {
        ToUse[] arr = {new ToUse(4, 21),
                new ToUse(1, 77), new ToUse(2, 90)};
        Arrays.sort(arr, new ComparatorUse());
        for (ToUse cu : arr)
            System.out.println(cu);
    }

}
