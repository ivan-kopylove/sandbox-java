package com.github.ivan.kopylove.challenges.eee3db0eba2c4a73ba4aa1c083de953a;

/**
 * https://leetcode.com/problems/palindrome-number/submissions/444093917/
 */
class Solution
{
    public boolean isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }

        int[] parsed = new int[10];
        int numLength = 0;
        for (int i = 0; i < 10; i++)
        {
            int remainder = x % 10;
            int quotient = x / 10;
            if (quotient > 0)
            {
                parsed[numLength++] = remainder;
            }
            if (quotient == 0)
            {
                parsed[numLength++] = x;
                if (remainder == 0)
                {
                    parsed[numLength++] = 0;
                }
                break;
            }
            x = x / 10;
        }

        boolean skippedLeadingZeroes = false;
        for (int i = 0, j = numLength - 1; i < numLength; i++, j--)
        {
            if (parsed[i] != parsed[j])
            {
                return false;
            }
        }

        return true;
    }
}
