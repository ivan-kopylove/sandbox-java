package com.github.ivan.kopylove.challenges.b383fc8381884a0bbbcea51c73e0bd54;

/**
 * <a href="https://leetcode.com/problems/count-number-of-homogenous-substrings/submissions/478423069/">1759. Count Number of Homogenous Substrings</a>
 */
class Solution
{
    public int countHomogenous(String s)
    {

        int counter = 1;
        char[] chars = s.toCharArray();
        int result = s.length() > 0 ? 1 : 0;
        for (int i = 0, length = s.length() - 1; i < length; i++)
        {
            if (chars[i] == chars[i + 1])
            {
                ++counter;
            }
            else
            {
                counter = 1;
            }
            result = (result + counter) % 1_000_000_007;
        }
        return result;
    }
}