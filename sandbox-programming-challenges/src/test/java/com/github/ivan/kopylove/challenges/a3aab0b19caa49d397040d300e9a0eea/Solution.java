package com.github.ivan.kopylove.challenges.a3aab0b19caa49d397040d300e9a0eea;

/**
 * <a href="https://leetcode.com/problems/remove-element/submissions/465465341/">27. Remove Element</a>
 */
class Solution
{
    public int removeElement(int[] nums, int val)
    {


        int fillingIndex = 0;
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
            System.out.println(val);
            if (nums[i] != val)
            {

                nums[fillingIndex++] = nums[i];
            }
        }
        return fillingIndex;
    }
}