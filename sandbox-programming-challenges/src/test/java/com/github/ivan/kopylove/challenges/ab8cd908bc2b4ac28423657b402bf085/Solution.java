package com.github.ivan.kopylove.challenges.ab8cd908bc2b4ac28423657b402bf085;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/word-pattern/submissions/839614017/">290. Word Pattern</a>
 */
class Solution
{
    public boolean wordPattern(String pattern, String s)
    {
        char[] chars = pattern.toCharArray();
        String[] words = s.split(" ");
        if (chars.length != words.length)
        {
            return false;
        }

        Map<Character, String> mapping = new HashMap<>();

        for (int i = 0; i < words.length; i++)
        {

            if (mapping.get(chars[i]) == null)
            {
                if (mapping
                           .containsValue(words[i]))
                {
                    return false;
                }
                mapping.put(chars[i], words[i]);
            }
            else if (!mapping.get(chars[i])
                             .equals(words[i]))
            {
                System.out.println(chars[i] + " " + words[i]);
                return false;
            }
        }
        return true;
    }
}