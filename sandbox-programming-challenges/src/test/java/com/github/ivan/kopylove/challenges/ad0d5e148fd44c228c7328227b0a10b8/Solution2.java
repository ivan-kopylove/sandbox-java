package com.github.ivan.kopylove.challenges.ad0d5e148fd44c228c7328227b0a10b8;

import java.util.HashMap;
import java.util.Map;

class Solution2
{
    private final Map<Integer, Integer> memo = new HashMap<>();

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

        Integer cached = memo.get(n);
        if (cached != null)
        {
            return cached;
        }
        memo.put(n, fib(n - 1) + fib(n - 2));

        return memo.get(n);
    }
}