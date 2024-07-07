package com.github.ivan.kopylove.challenges.a88794e1f76a4a4b8c741668d5f54a78;

/**
 * Implemented the solution of the task by
 * <p>
 * - reading and deeply understanding existing leetcode solution
 * <p>
 * - typing solution myself out of my head
 * <p>
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1254373968/
 */
class MaxProfitSolutionV2
{
    public int maxProfit(int[] prices)
    {
        int leastKnown = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++)
        {
            leastKnown = Math.min(leastKnown, prices[i]);
            profit = Math.max(profit, prices[i] - leastKnown);
        }

        return profit;
    }
}