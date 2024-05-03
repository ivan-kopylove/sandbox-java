package com.github.ivan.kopylove.challenges.bbdcb95c7e32488aa014fb290bd6fd7c;

/**
 * <a href="https://leetcode.com/problems/convert-the-temperature/submissions/845717348/">2469. Convert the Temperature</a>
 */
class Solution
{
    public double[] convertTemperature(double celsius)
    {
        return new double[]{celsius + 273.15, celsius * 1.8 + 32};
    }
}