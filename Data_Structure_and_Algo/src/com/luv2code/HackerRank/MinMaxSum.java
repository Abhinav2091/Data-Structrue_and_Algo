package com.luv2code.HackerRank;

import sun.util.resources.LocaleData;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;

public class MinMaxSum {

    public static void main(String ar[]) {
        Integer array[] = {3, 2, 1, 3};
        //getMinMax(Arrays.asList(array));
        //System.out.println(noOfDuplicates(Arrays.asList(array)));

        timeConverter("12:00:00AM");
    }

    static void getMinMax(List<Integer> array) {
        long sum = 0;
        Collections.sort(array);
        for (long aa : array) {

            sum = sum + aa;
            System.out.println(aa + ">>>>>>>>" + sum);
        }

        System.out.println(sum + "<--sum " + array.get(array.size() - 1));
        long maxSum = sum - array.get(0);
        long minSum = sum - array.get(array.size() - 1);
        System.out.println(minSum + " " + maxSum);

    }

    static int noOfDuplicates(List<Integer> candles) {
        int maxValue = 0;
        Map<Integer, Integer> candlesMap = new HashMap<>();
        for (int aa : candles) {
            maxValue = Math.max(maxValue, aa);
            if (candlesMap.containsKey(aa))
                candlesMap.put(aa, candlesMap.get(aa) + 1);
            else
                candlesMap.put(aa, 1);
        }
        return candlesMap.get(maxValue);
    }

    static String timeConverter(String s) {
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        Date ss= null;
        try {
            ss = df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        LocalDateTime lDT=ss.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        String[] result=lDT.toString().split("T");
        System.out.println(lDT);
        System.out.println(result[1]);
        return result[1].equals("00:00") ?"00:00:00":result[1];
    }
}
