package com.github.ivan.kopylove.challenges.b4094baee175486bb87dba241c22e71b;

/**
 * <a href="https://leetcode.com/problems/build-array-from-permutation/submissions/830644822/">1920. Build Array from Permutation</a>
 */
class Solution
{
    public int[] buildArray(int[] nums)
    {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            int index = i;
            for (int j = 0; j < 2; j++)
            {
                index = nums[index];
            }
            result[i] = index;
        }

        return result;
    }
}