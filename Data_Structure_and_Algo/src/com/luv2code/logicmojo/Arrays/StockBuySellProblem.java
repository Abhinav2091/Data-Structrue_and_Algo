package com.luv2code.logicmojo.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * An array is given as Input where ith element is the price of a given stock on day
 * You were permitted to complete unlimited transaction.
 * Derive an algorithm to find the maximum profit in O(n) Time complexity and O(n) Space Complexity
 */

public class StockBuySellProblem {

    //inner class to store buy and Sell object
    static class Stock {
        int buy;
        int sell;

        @Override
        public String toString() {
            return "Stock{" +
                    "buy=" + buy +
                    ", sell=" + sell +
                    '}';
        }
    }

    public static void main(String[] ar) {
        int[] array = {7, 6, 4, 3, 1};
        int n = array.length;
        int maxProfit = 0;

        List<Stock> resultList = findProfit(array, n);
        System.out.println(resultList);
        for (Stock result : resultList) {
            maxProfit = maxProfit + array[result.sell] - array[result.buy];
        }
        System.out.println("Max profit =" + maxProfit);
    }

    private static List<Stock> findProfit(int[] array, int length) {
        List<Stock> resultList = new ArrayList<>();
        //so here we need to do 2 thing

        for (int i = 0; i < length; i++) {

            Stock stock = new Stock();
            //first find the buy date that need to be less than the immediate next
            while (i < length - 1 && array[i] > array[i + 1])
                i++;
            stock.buy = i;
            //and then find sell date that need to greater than immediate next to get the max profit
            while (i < length - 1 && array[i] < array[i + 1])
                i++;
            stock.sell = i;

            resultList.add(stock);


        }
        return resultList;
    }


}


