package com.github.ivan.kopylove.challenges.b484d7f011484e8ebd21969e0dc0220c;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-nice-substring/submissions/475046031/">1763. Longest Nice Substring</a>
 */
class Solution
{
    public String longestNiceSubstring(String s)
    {
        if (s.length() < 2)
        {
            return "";
        }
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : arr) set.add(c);
        for (int i = 0; i < arr.length; i++)
        {
            char c = arr[i];
            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c)))
            {
                continue;
            }
            String sub1 = longestNiceSubstring(s.substring(0, i));
            String sub2 = longestNiceSubstring(s.substring(i + 1));
            return sub1.length() >= sub2.length() ? sub1 : sub2;
        }
        return s;
    }
}