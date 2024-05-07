package com.github.ivan.kopylove.challenges.ef9219a1ac684510a1b5e5b03f2bc9cb;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/submissions/443665791/">submission</a>
 */
class TwoSumSolutionV2
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            index.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++)
        {
            Integer foundIndex = index.get(target - nums[i]);
            if (foundIndex != null && foundIndex != i)
            {
                return new int[]{i, foundIndex};
            }
        }

        throw new RuntimeException();
    }
}