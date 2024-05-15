package com.github.ivan.kopylove.challenges.bded438157dd4a56b9494b5512fabba5;

/**
 * I solved the task myself without peeking at solutions using the most straightforward way - using java standard features.
 * <p>
 * The only difficulty was to use:
 * <p>
 * - .chars().mapToObj(c -> (char) c)
 * <p>
 * and
 * <p>
 * - cast to int
 * <p>
 * <a href="https://leetcode.com/problems/counting-bits/submissions/1254391729/">submissions/1254391729</a>
 */
class CountBitsSolutionV1
{
    public int[] countBits(int n)
    {
        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++)
        {
            String binary = Integer.toBinaryString(i);
            int ones = (int) binary.chars()
                                   .mapToObj(c -> (char) c)
                                   .filter(c -> c == '1')
                                   .count();
            result[i] = ones;
        }

        return result;
    }
}