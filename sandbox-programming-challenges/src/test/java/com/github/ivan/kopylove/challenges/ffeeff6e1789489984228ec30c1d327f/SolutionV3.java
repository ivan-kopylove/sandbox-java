package com.github.ivan.kopylove.challenges.ffeeff6e1789489984228ec30c1d327f;

/**
 * https://leetcode.com/problems/integer-to-roman/submissions/920693472/
 */
class SolutionV3
{
    public String intToRoman(int num)
    {
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] M = {"", "M", "MM", "MMM"};

        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
}