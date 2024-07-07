package com.github.ivan.kopylove.challenges.b46cf7de40ef4bcf8b82250258e904f2;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/largest-substring-between-two-equal-characters/submissions/481241611/">1624. Largest Substring Between Two Equal Characters</a>
 */
class Solution
{
    public int maxLengthBetweenEqualCharacters(String s)
    {

        Integer longest = -1;

        char[] chars = s.toCharArray();

        Map<Character, Integer> openings = new HashMap<>();

        for (int i = 0; i < chars.length; i++)
        {
            Integer startPos = openings.get(chars[i]);
            if (startPos != null)
            {
                Integer currentLength = i - startPos;
                if (currentLength > longest)
                {
                    longest = currentLength;
                }
            }
            else
            {
                openings.put(chars[i], i);
            }
        }
        if (longest > 0)
        {
            return longest - 1;
        }
        else
        {
            return longest;
        }
    }
}