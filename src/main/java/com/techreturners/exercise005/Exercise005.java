package com.techreturners.exercise005;

import java.util.Arrays;

public class Exercise005 {
    private char[] AtoZ = { 'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z' };

    public boolean isPangram(String input) {

        String defaultStr = "(.*)<XX>(.*)";
        if (input.isEmpty()) {
            return false;
        }
        String input2 = input.trim().toUpperCase();
        if (input2.length() < AtoZ.length) {
            return false;
        }

        int matchCount = 0;
        for (int i = 0; i < AtoZ.length; i++) {
            String regexStr = defaultStr.replace("<XX>", String.valueOf(AtoZ[i]));
            if (!input2.matches(regexStr)) {
                return false;
            }
            matchCount += 1;
        }
        return (matchCount == AtoZ.length);

    }

}
