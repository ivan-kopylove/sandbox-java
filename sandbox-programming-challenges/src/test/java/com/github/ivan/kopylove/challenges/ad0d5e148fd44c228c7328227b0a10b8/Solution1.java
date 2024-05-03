package com.github.ivan.kopylove.challenges.ad0d5e148fd44c228c7328227b0a10b8;

class Solution1
{
    public int fib(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        if (n == 1)
        {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}