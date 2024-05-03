package com.github.ivan.kopylove.challenges.a0b4741ed1dd4b3e8403ebe9a4362daa;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/submissions/445016775/
 */
class Solution
{
    public int romanToInt(String s)
    {
        Integer sum = 0;

        Map<String, Integer> twoLetterMapping = new HashMap<>();

        twoLetterMapping.put("IV", 4);
        twoLetterMapping.put("IX", 9);
        twoLetterMapping.put("XL", 40);
        twoLetterMapping.put("XC", 90);
        twoLetterMapping.put("CD", 400);
        twoLetterMapping.put("CM", 900);

        twoLetterMapping.put("I", 1);
        twoLetterMapping.put("V", 5);
        twoLetterMapping.put("X", 10);
        twoLetterMapping.put("L", 50);
        twoLetterMapping.put("C", 100);
        twoLetterMapping.put("D", 500);
        twoLetterMapping.put("M", 1000);


        for (int i = 0; i < s.length(); )
        {
            String one = String.valueOf(s.charAt(i));
            Integer letterCost;

            if (i < s.length() - 1)
            {
                String two = String.valueOf(s.charAt(i + 1));

                letterCost = twoLetterMapping.get(one + two);
                if (letterCost != null)
                {
                    sum += letterCost;
                    i++;
                    i++;
                    continue;
                }
            }

            letterCost = twoLetterMapping.get(one);
            if (letterCost != null)
            {
                sum += letterCost;
                i++;
                continue;
            }

            throw new RuntimeException("my123");
        }


        return sum;
    }
}