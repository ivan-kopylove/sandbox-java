package com.github.ivan.kopylove.challenges.a15d831afbcd4ef697c32157a0d1177d;

/**
 * solved by just memorizing existiing solution without understanding the gist
 * <a href="https://leetcode.com/problems/climbing-stairs/submissions/1256819673/">...</a>
 */
class ClimbStairsSolutionV3
{
    public int climbStairs(int n)
    {

        int[] cache = new int[n + 1];
        cache[0] = 1;
        cache[1] = 1;

        for (int i = 2; i <= n; i++)
        {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n];
    }
}