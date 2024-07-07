package com.github.ivan.kopylove.challenges.b43739dd1aa04369a3df6642ec4bba0c;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/submissions/942630006/">2194. Cells in a Range on an Excel Sheet</a>
 */
class Solution
{
    public List<String> cellsInRange(String s)
    {
        List<String> result = new ArrayList<>();

        String start = s.split(":")[0];
        String end = s.split(":")[1];


        for (char c = start.charAt(0); c <= end.charAt(0); c++)
        {
            for (int i = Character.getNumericValue(start.charAt(1)); i <= Character.getNumericValue(end.charAt(1)); i++)
            {
                result.add("" + c + i);
            }
        }

        return result;
    }
}