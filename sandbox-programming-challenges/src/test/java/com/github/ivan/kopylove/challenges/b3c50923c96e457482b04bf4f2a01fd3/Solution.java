package com.github.ivan.kopylove.challenges.b3c50923c96e457482b04bf4f2a01fd3;

/**
 * <a href="https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/submissions/480914253/">1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold</a>
 */
class Solution
{
    public int maxSideLength(int[][] mat, int threshold)
    {
        int m = mat.length, n = mat[0].length;
        // Find prefix sum
        int[][] prefixSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++)
        {
            int sum = 0;
            for (int j = 1; j <= n; j++)
            {
                sum += mat[i - 1][j - 1];
                prefixSum[i][j] = prefixSum[i - 1][j] + sum;
            }
        }
        // Start from the largest side length
        for (int k = Math.min(m, n) - 1; k > 0; k--)
        {
            for (int i = 1; i + k <= m; i++)
            {
                for (int j = 1; j + k <= n; j++)
                {
                    if (prefixSum[i + k][j + k] - prefixSum[i - 1][j + k] - prefixSum[i + k][j - 1] + prefixSum[i - 1][j - 1] <= threshold)
                    {
                        return k + 1;
                    }
                }
            }
        }
        return 0;
    }
}