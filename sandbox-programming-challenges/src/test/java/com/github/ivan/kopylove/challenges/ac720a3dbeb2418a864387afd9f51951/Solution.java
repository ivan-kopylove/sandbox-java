package com.github.ivan.kopylove.challenges.ac720a3dbeb2418a864387afd9f51951;

/**
 * <a href="https://leetcode.com/problems/arranging-coins/submissions/484497188/">441. Arranging Coins</a>
 */
class Solution
{
    public int arrangeCoins(int n)
    {
        for (int i = 1; n > 0; i++)
        {

            int temp = n - i;
            if (temp < i + 1)
            {
                return i;
            }
            n = temp;
        }
        return 0;
    }
}