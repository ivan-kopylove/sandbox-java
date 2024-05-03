package com.github.ivan.kopylove.challenges.ae482b57586b42ce96459cd4e42f254d;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome-ii/submissions/959603363/">680. Valid Palindrome II</a>
 */
class Solution
{
    public boolean validPalindrome(String s)
    {
        return checkRight(s) || checkLeft(s);
    }

    private boolean checkRight(String s)
    {

        boolean deletionUsed = false;

        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                System.out.println(i + " " + j + s.charAt(i) + " " + s.charAt(j - 1));

                if (!deletionUsed && s.charAt(i) == s.charAt(j - 1))
                {
                    j--;
                    deletionUsed = true;
                }
                else if (!deletionUsed && s.charAt(i + 1) == s.charAt(j))
                {
                    i++;
                    deletionUsed = true;
                }
                else
                {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkLeft(String s)
    {

        boolean deletionUsed = false;

        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                if (!deletionUsed && s.charAt(i + 1) == s.charAt(j))
                {
                    i++;
                    deletionUsed = true;
                }
                else if (!deletionUsed && s.charAt(i) == s.charAt(j - 1))
                {
                    j--;
                    deletionUsed = true;
                }
                else
                {
                    return false;
                }
            }
        }

        return true;
    }
}