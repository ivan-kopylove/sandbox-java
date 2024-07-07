package com.github.ivan.kopylove.challenges.b4d1df90d98b49178ae030e6fadce562;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/submissions/726040169/">1460. Make Two Arrays Equal by Reversing Subarrays</a>
 */
class Solution
{
    public boolean canBeEqual(int[] target, int[] arr)
    {
        if (target.length != arr.length)
        {
            System.out.println("target.length != arr.length");
            return false;
        }

        Map<Integer, Integer> frequenciesTarget = new HashMap<>();
        Map<Integer, Integer> frequenciesSource = new HashMap<>();

        for (int value : target)
        {
            Integer frequency = frequenciesTarget.get(value);
            if (frequency != null)
            {
                frequenciesTarget.put(value, ++frequency);
            }
            else
            {
                frequenciesTarget.put(value, 1);
            }
        }

        for (int value : arr)
        {
            Integer frequency = frequenciesSource.get(value);
            if (frequency != null)
            {
                frequenciesSource.put(value, ++frequency);
            }
            else
            {
                frequenciesSource.put(value, 1);
            }
        }

        for (Map.Entry<Integer, Integer> val : frequenciesTarget.entrySet())
        {
            Integer value = val.getKey();
            Integer frequency = val.getValue();
            Integer sourceFrequency = frequenciesSource.get(value);
            if (sourceFrequency != frequency)
            {
                return false;
            }
        }

        return true;
    }
}