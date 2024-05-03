package com.github.ivan.kopylove.challenges.a7cfba23aaf8460e88ea61cda356e96e;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray/submissions/721493625/">53. Maximum Subarray</a>
 */
class Solution
{
    public int maxSubArray(int[] nums)
    {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            if (currentSum <= 0)
            {
                currentSum = 0;
            }


            if (nums[i] + currentSum > maxSum)
            {
                maxSum = nums[i] + currentSum;
            }

            currentSum = nums[i] + currentSum;
        }

        return maxSum;
    }
}