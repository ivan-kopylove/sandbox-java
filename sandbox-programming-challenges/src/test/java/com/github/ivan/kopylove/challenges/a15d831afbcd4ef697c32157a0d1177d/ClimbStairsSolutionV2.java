package com.github.ivan.kopylove.challenges.a15d831afbcd4ef697c32157a0d1177d;

import java.util.HashMap;
import java.util.Map;

/**
 * First attempt led to TLE
 * Then I remembered that passing right side of the tree can be cached, so that I applied memoization - purely by memory from previous attempt.
 * <a href="https://leetcode.com/problems/climbing-stairs/submissions/1256792474/">...</a>
 */
class ClimbStairsSolutionV2
{
    public int climbStairs(int n)
    {
        Map<Integer, Integer> cache = new HashMap<>();

        return doClimb(n, cache);
    }

    private int doClimb(int n, Map<Integer, Integer> cache)
    {
        Integer value = cache.get(n);
        if (value != null)
        {
            return value;
        }

        if (n <= 0)
        {
            return 0;
        }
        if (n == 1)
        {
            return 1;
        }
        if (n == 2)
        {
            return 2;
        }

        int one = doClimb(n - 1, cache);
        cache.put(n - 1, one);

        int two = doClimb(n - 2, cache);
        cache.put(n - 2, two);

        return one + two;
    }
}