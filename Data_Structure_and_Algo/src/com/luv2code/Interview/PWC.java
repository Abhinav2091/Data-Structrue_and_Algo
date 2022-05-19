package com.luv2code.Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class PWC {
    public static void main(String ar[]) {
        String input = "fgdt-axxx-xxxx-ffdy";

        StringBuilder result = new StringBuilder("");

        {
            //this can be any special char for our case we are using "-"
            for (String splitString : input.split("-")) {
               // result.append(getIndividualCompressedString(splitString));
                //fgdt-4x-4x-2fdy
                //fgdt-a3x-4x2fd
               // result.append(shiftFirst2Char(getIndividualCompressedString(splitString)));
                //dtfg4x4xdy2f
                //dtfg-xa3-4xdy2
                result.append(getDeCompressedString(shiftFirst2Char(getIndividualCompressedString(splitString)))+"-");
            }

        }
        String finalValue=result.substring(0,result.length()-1);
        System.out.println("string after decompression::"+finalValue);
        System.out.println("byte difference:"+(input.length()-finalValue.length()));
    }


    static String getIndividualCompressedString(String input) {
        StringBuilder resultBuilder = new StringBuilder();
        Map<Character, Integer> resultMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (resultMap.containsKey(input.charAt(i)))
                resultMap.put(input.charAt(i), resultMap.get(input.charAt(i)) + 1);
            else
                resultMap.put(input.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> mapResult : resultMap.entrySet()) {
            //Compressing the char
            if (mapResult.getValue() != 1)
                resultBuilder.append(mapResult.getValue()).append(mapResult.getKey());
            else
                resultBuilder.append(mapResult.getKey());
        }

        return resultBuilder.toString();
    }

    static String shiftFirst2Char(String resultBuilder) {
//shifting first two to its right
        return resultBuilder.substring(2).concat(resultBuilder.substring(0, 2));
    }

    static String getDeCompressedString(String resultBuilder) {
        String counter = "";
        StringBuilder tempSB = new StringBuilder();
        int count = 0;
        for (int i = 0; i < resultBuilder.length(); i++) {
            if (Character.isLetter(resultBuilder.charAt(i)) && count == 0) {
                tempSB.append(resultBuilder.charAt(i));
            } else if (Character.isLetter(resultBuilder.charAt(i)) && count != 0) {
                for (int j = 0; j < count; j++) {
                    tempSB.append(resultBuilder.charAt(i));
                }
                count = 0;
            } else {
                counter = counter + resultBuilder.charAt(i);

                count = Integer.parseInt(counter);
            }
        }
        return tempSB.toString();
    }
}

