package com.github.ivan.kopylove.challenges.b7c95724d5114aebaa4ab3b61b3c2a31;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/number-of-good-pairs/submissions/942594433/">1512. Number of Good Pairs</a>
 */
class Solution
{
    public int numIdenticalPairs(int[] nums)
    {

        int counter = 0;
        Map<Integer, Integer> occurences = new HashMap<>();


        for (int i = 0; i < nums.length; i++)
        {
            Integer occurenceNumber = occurences.get(nums[i]);
            if (occurenceNumber == null)
            {
                occurences.put(nums[i], 1);
            }
            else
            {
                counter += occurenceNumber;
                occurences.put(nums[i], ++occurenceNumber);
            }
        }

        return counter;
    }
}