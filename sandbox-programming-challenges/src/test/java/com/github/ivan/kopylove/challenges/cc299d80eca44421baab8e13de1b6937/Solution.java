package com.github.ivan.kopylove.challenges.cc299d80eca44421baab8e13de1b6937;

/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/submissions/920573169/">submissions/920573169</a>
 */
class Solution
{
    public String longestPalindrome(String s)
    {
        int start = 0;
        int end = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            int len1 = expandAroundCenter(i, i, s);
            int len2 = expandAroundCenter(i, i + 1, s);
            int len = Math.max(len1, len2);

            if (len > end - start)
            {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(int left, int right, String str)
    {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
        {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
