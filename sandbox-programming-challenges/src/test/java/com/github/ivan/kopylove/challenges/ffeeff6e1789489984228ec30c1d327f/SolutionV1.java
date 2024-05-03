package com.github.ivan.kopylove.challenges.ffeeff6e1789489984228ec30c1d327f;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/integer-to-roman/submissions/920684818/
 */
class SolutionV1
{
    public String intToRoman(int num)
    {
        StringBuilder result = new StringBuilder();

        Map<Integer, String> thousandsMapping = new HashMap<>();
        thousandsMapping.put(1, "M");
        thousandsMapping.put(2, "MM");
        thousandsMapping.put(3, "MMM");


        Map<Integer, String> hundredsMapping = new HashMap<>();
        hundredsMapping.put(1, "C");
        hundredsMapping.put(2, "CC");
        hundredsMapping.put(3, "CCC");
        hundredsMapping.put(4, "CD");
        hundredsMapping.put(5, "D");
        hundredsMapping.put(6, "DC");
        hundredsMapping.put(7, "DCC");
        hundredsMapping.put(8, "DCCC");
        hundredsMapping.put(9, "CM");


        Map<Integer, String> tensMapping = new HashMap<>();
        tensMapping.put(1, "X");
        tensMapping.put(2, "XX");
        tensMapping.put(3, "XXX");
        tensMapping.put(4, "XL");
        tensMapping.put(5, "L");
        tensMapping.put(6, "LX");
        tensMapping.put(7, "LXX");
        tensMapping.put(8, "LXXX");
        tensMapping.put(9, "XC");


        Map<Integer, String> onesMapping = new HashMap<>();
        onesMapping.put(1, "I");
        onesMapping.put(2, "II");
        onesMapping.put(3, "III");
        onesMapping.put(4, "IV");
        onesMapping.put(5, "V");
        onesMapping.put(6, "VI");
        onesMapping.put(7, "VII");
        onesMapping.put(8, "VIII");
        onesMapping.put(9, "IX");


        int thousands = num / 1000;
        int hundreds = (num - 1000 * thousands) / 100;
        int tens = (num - (1000 * thousands) - (100 * hundreds)) / 10;
        int ones = (num - (1000 * thousands) - (100 * hundreds)) - (10 * tens);


        result.append(thousandsMapping.get(thousands) != null ? thousandsMapping.get(thousands) : "");
        result.append(hundredsMapping.get(hundreds) != null ? hundredsMapping.get(hundreds) : "");
        result.append(tensMapping.get(tens) != null ? tensMapping.get(tens) : "");
        result.append(onesMapping.get(ones) != null ? onesMapping.get(ones) : "");

        return result.toString();
    }
}