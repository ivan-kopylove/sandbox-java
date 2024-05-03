package com.github.ivan.kopylove.challenges.b6d7852a0e064514a58106f2d87a34a9;

/**
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/submissions/831288365/">1480. Running Sum of 1d Array</a>
 */
class Solution
{
    public int[] runningSum(int[] nums)
    {
        int currentSum = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            currentSum += nums[i];
            result[i] = currentSum;
        }
        return result;
    }
}