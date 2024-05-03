package com.github.ivan.kopylove.challenges.b04c4a99364f4c3180a2a24b19cc015f;

/**
 * Reverse Integer
 * <p>
 * https://leetcode.com/problems/reverse-integer/submissions/444593527/
 */
class Solution
{
    public int reverse(int x)
    {
        int result = 0;
        while (x != 0)
        {
            int pop = x % 10;
            if (result > Integer.MAX_VALUE / 10 || result > Integer.MAX_VALUE / 10 && pop > 7)
            {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || result < Integer.MIN_VALUE / 10 && pop < -8)
            {
                return 0;
            }

            result = result * 10 + pop;
            x /= 10;
        }
        return result;
    }
}
