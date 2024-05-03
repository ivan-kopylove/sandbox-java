package com.github.ivan.kopylove.challenges.a15d831afbcd4ef697c32157a0d1177d;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs/submissions/923072640/">70. Climbing Stairs</a>
 */
class Solution
{
    public int climbStairs(int n)
    {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);

        return doClimb(n, memo);
    }

    private int doClimb(int n, Map<Integer, Integer> memo)
    {
        if (memo.containsKey(n))
        {
            return memo.get(n);
        }
        memo.put(n, doClimb(n - 1, memo) + doClimb(n - 2, memo));
        return memo.get(n);
    }
}