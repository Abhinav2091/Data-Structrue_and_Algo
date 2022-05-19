package com.luv2code.gfg;

public class PalindromeNumber {
    public static void main(String ar[]) {
        int number = 363;
        System.out.println(isPalindromeWithString(number));
        System.out.println(isPalindrome(number));

    }

    private static boolean isPalindromeWithString(int number) {
        StringBuilder reversedNumber = new StringBuilder();
        int tempNo = number;
        while (tempNo != 0) {
            reversedNumber.append(tempNo % 10);
            tempNo = tempNo / 10;
        }
        System.out.println(reversedNumber);

        return reversedNumber.toString().trim().equals(String.valueOf(number).trim());
    }

    private static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int tempNo = number;
        while (tempNo != 0) {
            reversedNumber = reversedNumber * 10 + (tempNo % 10);
            tempNo = tempNo / 10;
        }
        System.out.println(reversedNumber);

        return number == reversedNumber;
    }
}
