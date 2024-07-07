package com.github.ivan.kopylove.challenges.b2395ceca39142c4b16bdb391e215bb4;

/**
 * <a href="https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/submissions/945452049/">1828. Queries on Number of Points Inside a Circle</a>
 */
class Solution
{
    public int[] countPoints(int[][] points, int[][] queries)
    {
        int[] answers = new int[queries.length];

        for (int j = 0; j < queries.length; j++)
        {
            for (int i = 0; i < points.length; i++)
            {
                if (isInside(points[i][0], points[i][1], queries[j][0], queries[j][1], queries[j][2]))
                {
                    answers[j]++;
                }
            }
        }

        return answers;
    }

    private boolean isInside(int x, int y, int c1, int c2, int r)
    {
        double o1 = Math.pow(x - c1, 2);
        double o2 = Math.pow(y - c2, 2);

        double abc = o1 + o2;


        double temp = Math.sqrt(abc);

        return temp <= r;
    }
}