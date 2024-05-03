package com.github.ivan.kopylove.challenges.a1b8b3b74ae24e3081ef6d9de342705f;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/submissions/457658486/">14. Longest Common Prefix</a>
 */
class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        String result = strs.length > 0 ? strs[0] : "";

        for (int i = 0; i < strs.length; i++)
        {
            char[] candidate = result.toCharArray();
            char[] current = strs[i].toCharArray();

            int length = candidate.length < current.length ? candidate.length : current.length;
            String newResult = "";
            for (int j = 0; j < length; j++)
            {
                if (candidate[j] == current[j])
                {
                    newResult += candidate[j];
                }
                else
                {
                    break;
                }
            }
            result = newResult;
        }
        return result;
    }
}