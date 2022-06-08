package com.luv2code.gfg;

import java.util.*;

class Interval implements Comparator<Interval> {
    public int start;
    public int end;

    Interval() {
    }

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.start - o2.start;
    }
}

public class MergeOverlapInterval {
    public static void main(String ar[]) {
        Interval[] intervalArr = {new Interval(3, 15), new Interval(5, 10), new Interval(5, 7), new Interval(2, 7)};
        Arrays.sort(intervalArr, new Interval());
        int resultIndex = 0;
        for (int i = 1; i < intervalArr.length; i++) {
            if (intervalArr[resultIndex].end >= intervalArr[i].start) {
                intervalArr[resultIndex].start = Math.min(intervalArr[resultIndex].start, intervalArr[i].start);
                intervalArr[resultIndex].end = Math.max(intervalArr[resultIndex].end, intervalArr[i].end);
            } else {
                resultIndex++;
                intervalArr[resultIndex].start = intervalArr[i].start;
                intervalArr[resultIndex].end = intervalArr[i].end;
            }
        }

        for (int i = 0; i <= resultIndex; i++) {
            System.out.println(intervalArr[i]);
        }
    }


}
