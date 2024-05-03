package com.github.ivan.kopylove.challenges.af34dc81c19a435a98a67c65c2b192a2;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/min-cost-climbing-stairs/submissions/1000118483/">746. Min Cost Climbing Stairs</a>
 */
class Solution
{

    private int[] memo;

    public int minCostClimbingStairs(int[] cost)
    {
        memo = new int[cost.length];
        Arrays.fill(memo, -1);

        int first = doStep(cost, 1, 0);
        int zero = doStep(cost, 0, 0);

        return first < zero ? first : zero;
    }

    private int doStep(int[] cost, int step, int result)
    {
        if (step == cost.length - 1 || step == cost.length - 2)
        {
            return cost[step];
        }

        if (memo[step] != -1)
        {
            return memo[step];
        }

        int one = doStep(cost, step + 1, cost[step]);
        int two = doStep(cost, step + 2, cost[step]);


        memo[step] = one < two ? one : two;
        memo[step] += cost[step];

        return memo[step];
    }
}