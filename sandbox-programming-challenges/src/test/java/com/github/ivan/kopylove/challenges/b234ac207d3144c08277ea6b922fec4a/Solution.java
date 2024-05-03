package com.github.ivan.kopylove.challenges.b234ac207d3144c08277ea6b922fec4a;

/**
 * <a href="https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/submissions/473799222/">1752. Check if Array Is Sorted and Rotated</a>
 */
class Solution
{
    public boolean check(int[] nums)
    {
        int leftMin = nums[0];
        boolean fall = false;
        int max = nums[0];
        int max2 = 0;

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (!fall)
            {
                if (nums[i + 1] >= max)
                {
                    max = nums[i + 1];
                }
                else
                {
                    fall = true;
                    max2 = nums[i + 1];
                }
            }
            else
            {
                if (nums[i + 1] >= max2 && nums[i + 1] <= leftMin)
                {
                    max2 = nums[i];
                }
                else
                {
                    return false;
                }
            }
        }

        if (fall)
        {
            return nums[nums.length - 1] <= leftMin;
        }

        return true;
    }
}