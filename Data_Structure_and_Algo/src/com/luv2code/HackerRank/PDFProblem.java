package com.luv2code.HackerRank;

import java.util.Arrays;
import java.util.List;

/**
 * There is a list of  character heights aligned by index to their letters.
 * For example, 'a' is at index 0 and 'z' is at index 25.
 * There will also be a string. Using the letter heights given,
 * determine the area of the rectangle highlight in  mm2(m squere) assuming all letters are  1mm wide.
 * <p>
 * roughley:::: find the largest number at the given index and multiple it with the number of char and return it.
 */

public class PDFProblem {

    public static void main(String ar[]) {

        Integer[] wordIndex = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String word = "abc";


        List<Integer> h = Arrays.asList(wordIndex);
        int result = designerPdfViewer(h, word);
        System.out.println(result);
    }

    static int designerPdfViewer(List<Integer> h, String word) {
        int wordLength = word.length();

        int largestValue = 0;

        //check th length of word else return 0
        if (wordLength == 0)
            return 0;
        //get the number for char in word
        //fetch the largest no in array for word
        for (int i = 0; i < wordLength; i++) {
            //charIndex[i] = getCharIndex(word.charAt(i));
            int tempIndex = getCharIndex(word.charAt(i));

            if (largestValue < h.get(tempIndex))
                largestValue = h.get(tempIndex);
        }


        //System.out.println(largestValue);
        //multiple it with lenght of word

        //return

        return largestValue * wordLength;

    }

    static int getCharIndex(char c) {
        return c - 'a';
    }
}
