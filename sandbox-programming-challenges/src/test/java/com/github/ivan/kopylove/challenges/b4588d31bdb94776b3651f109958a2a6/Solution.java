package com.github.ivan.kopylove.challenges.b4588d31bdb94776b3651f109958a2a6;

/**
 * <a href="https://leetcode.com/problems/concatenation-of-array/submissions/830660049/">1929. Concatenation of Array</a>
 */
class Solution
{
    public int[] getConcatenation(int[] nums)
    {
        int[] result = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++)
        {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }
}