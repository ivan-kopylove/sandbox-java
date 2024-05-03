package com.github.ivan.kopylove.challenges.a6d65f04a2c04c05acc7d5f840914cc6;

/**
 * <a href="https://leetcode.com/problems/jump-game-ii/submissions/929016422/">45. Jump Game II</a>
 */
class Solution
{
    public int jump(int[] nums)
    {
        int result = 0;
        int currFurthest = 0;
        int currentEnd = 0;


        for (int i = 0; i < nums.length - 1; i++)
        {
            currFurthest = Math.max(currFurthest, i + nums[i]);


            if (i == currentEnd)
            {
                result++;
                currentEnd = currFurthest;
            }
        }
        return result;
    }
}