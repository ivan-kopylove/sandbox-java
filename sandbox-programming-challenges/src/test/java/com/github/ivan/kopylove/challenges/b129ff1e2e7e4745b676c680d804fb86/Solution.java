package com.github.ivan.kopylove.challenges.b129ff1e2e7e4745b676c680d804fb86;

/**
 * <a href="https://leetcode.com/problems/decode-xored-array/submissions/852741198/">1720. Decode XORed Array</a>
 */
class Solution
{
    public int[] decode(int[] encoded, int first)
    {
        int[] result = new int[encoded.length + 1];
        result[0] = first;

        for (int i = 1; i < result.length; i++)
        {
            result[i] = encoded[i - 1] ^ result[i - 1];
        }

        return result;
    }
}