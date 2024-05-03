package com.github.ivan.kopylove.challenges.b2e3ed2488bb4acaa02a7d9e4a94e23f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/submissions/931373765/">1282. Group the People Given the Group Size They Belong To</a>
 */
class Solution
{
    public List<List<Integer>> groupThePeople(int[] groupSizes)
    {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, List<Integer>> bucketCounterAccumulator = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++)
        {
            List<Integer> currentBucket = bucketCounterAccumulator.computeIfAbsent(groupSizes[i], b -> new ArrayList());
            currentBucket.add(i);

            if (currentBucket.size() == groupSizes[i])
            {
                result.add(currentBucket);
                bucketCounterAccumulator.put(groupSizes[i], new ArrayList());
            }
        }


        return result;
    }
}