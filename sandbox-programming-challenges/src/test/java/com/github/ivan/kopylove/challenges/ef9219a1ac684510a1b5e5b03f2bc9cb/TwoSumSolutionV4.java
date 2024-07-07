package com.github.ivan.kopylove.challenges.ef9219a1ac684510a1b5e5b03f2bc9cb;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/submissions/1250842211/">...</a>
 * </br>
 * Peeked at solution on the subject that this is possible and implemented this myself.
 * </br>
 * This is called «1-pass solution».
 */
class TwoSumSolutionV4
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            Integer idx = index.get(nums[i]);
            if (idx == null)
            {
                index.put(nums[i], i);
            }
            idx = index.get(target - nums[i]);

            if (idx != null && i != idx)
            {
                if (nums[i] + nums[idx] == target)
                {
                    return new int[]{idx, i};
                }
            }
        }

        return new int[]{};
    }
}