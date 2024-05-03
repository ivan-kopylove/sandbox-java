package com.github.ivan.kopylove.challenges.aef74da4b65c4999ba121ed728b01b9c;

/**
 * <a href="https://leetcode.com/problems/redundant-connection/submissions/830012416/">684. Redundant Connection</a>
 */
class Solution
{
    private int[] parents;

    public int[] findRedundantConnection(int[][] edges)
    {
        parents = new int[edges.length + 1];

        for (int i = 0; i < parents.length; i++)
        {
            parents[i] = i;
        }

        for (int[] edge : edges)
        {
            if (findUltimateParent(edge[0]) == findUltimateParent(edge[1]))
            {
                return edge;
            }
            else
            {
                union(edge[0], edge[1]);
            }
        }
        return new int[1];
    }

    private void union(int x, int y)
    {
        parents[findUltimateParent(y)] = findUltimateParent(x);
    }

    private int findUltimateParent(int value)
    {
        if (value != parents[value])
        {
            parents[value] = findUltimateParent(parents[value]);
        }
        return parents[value];
    }
}