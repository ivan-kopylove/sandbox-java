package com.github.ivan.kopylove.challenges.b5e58b328d2447688162d1c31d1f3987;

/**
 * <a href="https://leetcode.com/problems/shuffle-the-array/submissions/978425288/">1470. Shuffle the Array</a>
 */
class Solution
{
    public int[] shuffle(int[] nums, int n)
    {

        for (int i = 0, j = nums.length / 2; i < nums.length / 2; i++, j++)
        {
            nums[i] = nums[i] << 10;
            nums[i] = nums[i] | nums[j];
        }


        for (int i = nums.length / 2 - 1, q = nums.length - 1; i >= 0; i--, q -= 2)
        {
            int first = nums[i] >> 10;
            int second = nums[i] & 0b00000000001111111111;

            nums[q] = second;
            nums[q - 1] = first;
        }


        return nums;
    }
} 