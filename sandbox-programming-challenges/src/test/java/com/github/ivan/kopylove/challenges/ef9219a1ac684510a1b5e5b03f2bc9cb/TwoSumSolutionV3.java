package com.github.ivan.kopylove.challenges.ef9219a1ac684510a1b5e5b03f2bc9cb;

/**
 * <a href="https://leetcode.com/problems/two-sum/submissions/1250792415/">1. Two Sum</a>
 * </p>
 * Solved this fully myself without peeking at the solutions.
 * </p>
 */
class TwoSumSolutionV3
{
    public int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if (i != j && nums[i] + nums[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }
}