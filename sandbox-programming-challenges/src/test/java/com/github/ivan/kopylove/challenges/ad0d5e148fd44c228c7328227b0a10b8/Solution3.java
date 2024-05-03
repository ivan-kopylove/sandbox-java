package com.github.ivan.kopylove.challenges.ad0d5e148fd44c228c7328227b0a10b8;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/submissions/1000027383/">509. Fibonacci Number</a>
 */
class Solution3
{

    public int fib(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++)
        {
            int temp = current;
            current = current + previous;
            previous = temp;
        }
        return current;
    }
}