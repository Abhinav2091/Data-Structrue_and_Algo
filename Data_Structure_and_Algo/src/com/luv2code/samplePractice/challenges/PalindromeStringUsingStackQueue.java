package com.luv2code.samplePractice.challenges;

import java.util.LinkedList;

public class PalindromeStringUsingStackQueue {

    public static void main(String ar[]) {

        System.out.println(checkForPalindrome("abccba"));//true
        System.out.println(checkForPalindrome("Was it a car or a cat i saw?"));//true
        System.out.println(checkForPalindrome("I did,did I?"));//true
        System.out.println(checkForPalindrome("hello"));//false
        System.out.println(checkForPalindrome("Don't nod"));//true

    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowercase = string.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                queue.addLast(c);
            }
        }
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst()))
                return false;
        }
        return true;
    }

}
