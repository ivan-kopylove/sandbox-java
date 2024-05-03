package com.github.ivan.kopylove.challenges.a15b66a003e845168f05dd9e2bacd8dc;

/**
 * <a href="https://leetcode.com/problems/sqrtx/submissions/922335542/">69. Sqrt(x)</a>
 */
class Solution
{
    public int mySqrt(int x)
    {
        if (x == 0)
        {
            return 0;
        }

        int i = 2;
        long xLong = x;
        while (((long) i * i) <= xLong)
        {
            i++;
        }

        return i - 1;
    }
}