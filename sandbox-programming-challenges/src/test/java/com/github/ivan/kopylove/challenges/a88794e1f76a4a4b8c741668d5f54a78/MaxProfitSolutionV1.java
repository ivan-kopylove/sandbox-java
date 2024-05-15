package com.github.ivan.kopylove.challenges.a88794e1f76a4a4b8c741668d5f54a78;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/927040706/">121. Best Time to Buy and Sell Stock</a>
 */
class MaxProfitSolutionV1
{
    public int maxProfit(int[] prices)
    {

        int maxProfit = 0;
        int minBuy = prices[0];

        for (int i = 0, j = 1; j < prices.length; j++)
        {
            if (prices[j] < minBuy)
            {
                i = j;
                minBuy = prices[j];
            }

            if (prices[j] - prices[i] > maxProfit)
            {
                maxProfit = prices[j] - prices[i];
            }
        }

        return maxProfit;
    }
}