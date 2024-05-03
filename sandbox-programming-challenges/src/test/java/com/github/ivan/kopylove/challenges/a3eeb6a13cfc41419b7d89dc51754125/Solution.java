package com.github.ivan.kopylove.challenges.a3eeb6a13cfc41419b7d89dc51754125;

/**
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/465998769/">28. Find the Index of the First Occurrence in a String</a>
 */
class Solution
{
    public int strStr(String haystack, String needle)
    {
        if (needle.length() == 0)
        {
            return 0;
        }
        if (needle.length() > haystack.length())
        {
            return -1;
        }

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int result = -1;

        for (int i = 0; i < h.length; i++)
        {
            if (h[i] == n[0] && h.length - i >= n.length)
            {
                boolean found = true;

                for (int j = 0, k = i; j < n.length; j++, k++)
                {
                    if (h[k] != n[j])
                    {
                        found = false;
                        break;
                    }
                }

                if (found)
                {
                    return i;
                }
            }
        }
        return result;
    }
}