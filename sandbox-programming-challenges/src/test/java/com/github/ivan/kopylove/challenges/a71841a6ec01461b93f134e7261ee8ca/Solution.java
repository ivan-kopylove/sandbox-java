package com.github.ivan.kopylove.challenges.a71841a6ec01461b93f134e7261ee8ca;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/pascals-triangle/submissions/925794102/">118. Pascal's Triangle</a>
 */
class Solution
{
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> result = new ArrayList();

        if (numRows >= 1)
        {
            List<Integer> line = new ArrayList();
            line.add(1);
            result.add(line);
        }

        if (numRows >= 2)
        {
            List<Integer> line = new ArrayList();
            line.add(1);
            line.add(1);
            result.add(line);
        }

        for (int i = 2; i < numRows; i++)
        {
            List<Integer> line = new ArrayList();
            line.add(1);

            List<Integer> previousLine = result.get(i - 1);
            for (int j = 0; j < previousLine.size() - 1; j++)
            {
                line.add(previousLine.get(j) + previousLine.get(j + 1));
            }

            line.add(1);
            result.add(line);
        }
        return result;
    }
}