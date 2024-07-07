package com.github.ivan.kopylove.challenges.ef9219a1ac684510a1b5e5b03f2bc9cb;

/**
 * <a href="https://leetcode.com/problems/two-sum/submissions/443662261/">submission</a>
 */

class TwoSumSolutionV1
{
    public int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 1; j < nums.length; j++)
            {
                if (i != j)
                {
                    if (nums[i] + nums[j] == target)
                    {
                        int[] result = new int[2];
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return new int[2];
    }
}