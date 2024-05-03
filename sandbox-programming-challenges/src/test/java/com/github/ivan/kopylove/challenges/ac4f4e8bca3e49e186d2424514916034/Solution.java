package com.github.ivan.kopylove.challenges.ac4f4e8bca3e49e186d2424514916034;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/longest-increasing-subsequence/submissions/1000762295/">300. Longest Increasing Subsequence</a>
 */
class Solution
{
    private final Map<Integer, Integer> memo = new HashMap<>();

    public int lengthOfLIS(int[] nums)
    {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++)
        {
            result.add(run(nums, i));
        }

        return result.stream()
                     .mapToInt(v -> v)
                     .max()
                     .orElse(0);
    }

    private int run(int[] nums, int previousIncreasingStep)
    {
        if (previousIncreasingStep >= nums.length)
        {
            return 0;
        }

        Integer cached = memo.get(previousIncreasingStep);
        if (cached != null)
        {
            return cached;
        }
        List<Integer> result = new ArrayList<>();

        for (int i = previousIncreasingStep; i < nums.length - 1; i++)
        {
            if (nums[i + 1] > nums[previousIncreasingStep])
            {
                int res = run(nums, i + 1);
                result.add(res);
            }
        }

        Integer calculatedLength = result.stream()
                                         .mapToInt(v -> v)
                                         .max()
                                         .orElse(0);
        memo.put(previousIncreasingStep, calculatedLength + 1);
        return memo.get(previousIncreasingStep);
    }
}