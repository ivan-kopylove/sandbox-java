package com.github.ivan.kopylove.challenges.bc6b54c9ac0949bf8760a27d7ea23eed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/submissions/947798994/">2610. Convert an Array Into a 2D Array With Conditions</a>
 */
class Solution
{
    public List<List<Integer>> findMatrix(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, Integer> nextRow = new HashMap<>();
        List<Integer> row = new ArrayList<>();
        result.add(row);

        for (int num : nums)
        {

            Integer number = nextRow.get(num);

            if (number == null)
            {
                nextRow.put(num, 1);
                result.get(0)
                      .add(num);
            }
            else
            {
                if (number >= result.size())
                {
                    row = new ArrayList<>();
                    result.add(row);
                }

                result.get(number)
                      .add(num);
                nextRow.put(num, ++number);
            }
        }

        return result;
    }
}