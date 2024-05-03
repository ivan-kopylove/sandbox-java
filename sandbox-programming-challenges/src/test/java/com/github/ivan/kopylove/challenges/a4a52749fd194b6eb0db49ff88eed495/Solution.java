package com.github.ivan.kopylove.challenges.a4a52749fd194b6eb0db49ff88eed495;

/**
 * <a href="https://leetcode.com/problems/search-insert-position/submissions/466436861/">35. Search Insert Position</a>
 */
class Solution
{
    public int searchInsert(int[] nums, int target)
    {

        if (nums[nums.length - 1] == target)
        {
            return nums.length - 1;
        }
        if (nums[nums.length - 1] < target)
        {
            return nums.length;
        }
        if (nums[0] > target)
        {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == target)
            {
                return i;
            }

            if (nums[i] < target && nums[i + 1] > target)
            {
                return i + 1;
            }
        }
        return -1;
    }
}