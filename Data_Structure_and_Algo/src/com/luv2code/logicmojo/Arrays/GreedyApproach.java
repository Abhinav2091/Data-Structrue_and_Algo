package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;

/**
 * Greedy Approach is approch that is best suitable for present scinerio and we never reverse it
 * <p>
 * List of arrival and departure time is given,
 * Find the minimum number of platforms are required for the railway as no train waits
 */

public class GreedyApproach {
    public static void main(String ar[]) {
        double[] arrival = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
        double[] departure = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};
        System.out.println("No of PlatForm Required = " + minimumNumberOfPlatform(arrival, departure, arrival.length));

    }

    static int minimumNumberOfPlatform(double arrival[], double departure[], int n) {
        //first sort the departure array so that I can chek how many platform I required
        //as arrival array is already sorted
        Arrays.sort(departure);

        int i = 0, j = 0, platFormRequired = 0, maxPlatForm = 0;

        //now compare the 1st element of arrival with departure one by one
        while (i < n && j < n) {

            if (arrival[i] <= departure[j]) {
                i++;
                platFormRequired++;
                if (platFormRequired > maxPlatForm)
                    maxPlatForm = platFormRequired;
            } else {
                j++;
                platFormRequired--;
            }
        }
        return maxPlatForm;
    }
}
