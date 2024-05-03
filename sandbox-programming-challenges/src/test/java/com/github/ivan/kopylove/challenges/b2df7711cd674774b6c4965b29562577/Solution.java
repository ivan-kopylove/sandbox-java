package com.github.ivan.kopylove.challenges.b2df7711cd674774b6c4965b29562577;

/**
 * <a href="https://leetcode.com/problems/n-th-tribonacci-number/submissions/1000063566/">1137. N-th Tribonacci Number</a>
 */
class Solution
{

    public int tribonacci(int n)
    {
        if (n == 0)
        {
            return 0;
        }

        int previous2 = 0;
        int previous1 = 1;
        int current = 1;

        for (int i = 3; i <= n; i++)
        {
            int temp = current;
            current = current + previous1 + previous2;
            previous2 = previous1;
            previous1 = temp;
        }
        return current;
    }
}