package com.github.ivan.kopylove.challenges.a3130066fc0d497bab228d0650f4f94f;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/single-number/submissions/926722727/">136. Single Number</a>
 */
class Solution
{
    public int singleNumber(int[] nums)
    {
        if (nums.length == 1)
        {
            return nums[0];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i += 2)
        {
            if (nums[i] != nums[i + 1])
            {
                return nums[i];
            }
        }

        if (nums.length % 2 != 0 && nums.length > 2)
        {
            if (nums[nums.length - 1] != nums[nums.length - 2])
            {
                return nums[nums.length - 1];
            }
        }

        return 0;
    }
}