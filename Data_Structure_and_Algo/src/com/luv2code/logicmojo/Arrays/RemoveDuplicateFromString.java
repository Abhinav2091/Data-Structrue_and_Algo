package com.luv2code.logicmojo.Arrays;

import java.util.Arrays;

/**
 * String is given as input that contains only lowercase letters,
 * remove duplicate letters so that every letter appears once In O(n) Time Complexity and O(1) Space Complexity
 * <p>
 * Hint :: here we use ascii array whose length is 256 because character value is between 1-255
 */

public class RemoveDuplicateFromString {

    public static void main(String[] ar) {
        String str = "aabbccdef";
        System.out.println(removeDuplicatesFromString(str));
    }

    private static String removeDuplicatesFromString(String val) {
        //convert string to char array
        char[] charArray = val.toCharArray();
        val = "";
        int[] ascii = new int[256];

        for (int i = 0; i < charArray.length; i++) {
            if (ascii[charArray[i]] == 0)
                ascii[charArray[i]] = 1;
            else if (ascii[charArray[i]] == 1)
                charArray[i] = '\0';

            val = val.concat(String.valueOf(charArray[i]));

        }
        System.out.println(charArray);
        return val.replaceAll("\0", "");
    }
}
