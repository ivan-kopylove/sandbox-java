package com.github.ivan.kopylove.challenges.ba81eb12606b4c3697f3f7405ca4758b;

/**
 * <a href="https://leetcode.com/problems/strictly-palindromic-number/submissions/943100560/">2396. Strictly Palindromic Number</a>
 */
class Solution
{
    public boolean isStrictlyPalindromic(int n)
    {


        for (int i = 2; i <= n - 2; i++)
        {

            if (!isPalindromic(Integer.toString(n, i)))
            {
                return false;
            }
        }


        return true;
    }

    private boolean isPalindromic(String n)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        return sb.reverse()
                 .toString()
                 .equals(n);
    }
}