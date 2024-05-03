package com.github.ivan.kopylove.challenges.aaebcfa1590f483d870ea35ee43a7127;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self/submissions/445914566/">238. Product of Array Except Self</a>
 */
class Solution
{
    public int[] productExceptSelf(int[] nums)
    {
        int[] result = new int[nums.length];
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];

        l[0] = 1;
        for (int i = 0; i < nums.length - 1; i++)
        {
            l[i + 1] = nums[i] * l[i];
        }

        r[nums.length - 1] = 1;
        for (int i = nums.length - 1; i > 0; i--)
        {
            r[i - 1] = nums[i] * r[i];
        }


        for (int i = 0; i < result.length; i++)
        {
            result[i] = l[i] * r[i];
        }
        return result;
    }
}