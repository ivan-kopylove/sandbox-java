package com.github.ivan.kopylove.challenges.bd6e931e4d45415593255f44e5f40b35;

import java.util.Arrays;

/**
 * I solved the task myself without peeking at solutions using the most straightforward way - using java standard features.
 * <p>
 * But the fact it can be solved
 * <p>
 * <p> - by implementing sorting
 * <p> - by putting elements of array into map where value is counter
 * https://leetcode.com/problems/contains-duplicate/submissions/1251643892/
 */
class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        int[] distinctNums = Arrays.stream(nums)
                                   .distinct()
                                   .toArray();
        return nums.length != distinctNums.length;
    }
}