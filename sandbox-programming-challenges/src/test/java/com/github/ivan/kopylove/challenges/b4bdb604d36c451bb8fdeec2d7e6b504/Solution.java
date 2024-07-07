package com.github.ivan.kopylove.challenges.b4bdb604d36c451bb8fdeec2d7e6b504;

/**
 * <a href="https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/990667987/">1389. Create Target Array in the Given Order</a>
 */
class Solution
{
    public int[] createTargetArray(int[] nums, int[] index)
    {
        int[] target = new int[nums.length];

        for (int i = 0; i < index.length; i++)
        {
            for (int k = target.length - 1; k > index[i]; k--)
            {
                target[k] = target[k - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}