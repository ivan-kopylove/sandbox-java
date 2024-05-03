package com.github.ivan.kopylove.challenges.a3a8fd936d854f3482a77315afc85fc9;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/465447446/">26. Remove Duplicates from Sorted Array</a>
 */
class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int currentNumber = nums.length > 0 ? nums[0] : 0;
        int fillIndex = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (currentNumber != nums[i])
            {
                currentNumber = nums[i];
                nums[++fillIndex] = nums[i];
            }
        }
        return fillIndex + 1;
    }
}