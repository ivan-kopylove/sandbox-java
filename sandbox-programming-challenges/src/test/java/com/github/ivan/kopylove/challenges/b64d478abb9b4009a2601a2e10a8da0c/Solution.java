package com.github.ivan.kopylove.challenges.b64d478abb9b4009a2601a2e10a8da0c;

/**
 * <a href="https://leetcode.com/problems/slowest-key/submissions/482570966/">1629. Slowest Key</a>
 */
class Solution
{
    public char slowestKey(int[] releaseTimes, String keysPressed)
    {

        char[] chars = keysPressed.toCharArray();


        int longestHoldTime = releaseTimes[0];
        char result = chars[0];
        for (int i = 1; i < chars.length; i++)
        {
            int holdTime = releaseTimes[i] - releaseTimes[i - 1];
            if (holdTime > longestHoldTime)
            {
                result = chars[i];
                longestHoldTime = holdTime;
            }

            if (holdTime == longestHoldTime && result < chars[i])
            {
                result = chars[i];
            }
        }
        return result;
    }
}