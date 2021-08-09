package com.luv2code.logicmojo.Arrays;

/**
 * You have an array of non-negative integers,
 * you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index in O(n) Time complexity and O(1) Space Complexity
 */
public class JumpProblem {
    public static void main(String ar[]) {
        int array[] = {3, 2, 1, 0, 4};
        int result = noOfJumps(array);
        System.out.println(result);
    }

    //take the 0rth value do looping unless that number meet update jump
    static int noOfJumps(int[] array) {
        int jump = 1;
        int jumpSteps = array[0];
        int tempJumpSteps = array[0];
        for (int i = 1; i < array.length; i++) {
            //if we reach to the last of the array then return jump
            //so that we don't process the last value
            if (i == array.length - 1)
                return jump;


            jumpSteps--;
            tempJumpSteps--;
            //chek if temp jump is greater then any value we get so that we can replace it
            if (tempJumpSteps < array[i])
                tempJumpSteps = array[i];
            //if jump step is equal to zero i need to update jump step with other max number
            //so that I can reach at the end with minimum jumps
            //also decrement that value too while i move forward
            if (jumpSteps == 0) {
                jumpSteps = tempJumpSteps;
                jump++;
            }
            //if number of step taken is zero then we cant go further
            if (tempJumpSteps == 0)
                return 0;
        }
        return jump;
    }
}
