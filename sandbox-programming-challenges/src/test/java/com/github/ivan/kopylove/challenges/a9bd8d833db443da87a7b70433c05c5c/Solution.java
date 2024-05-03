package com.github.ivan.kopylove.challenges.a9bd8d833db443da87a7b70433c05c5c;

/**
 * <a href="https://leetcode.com/problems/length-of-last-word/submissions/831900041/">58. Length of Last Word</a>
 */
class Solution
{
    public int lengthOfLastWord(String s)
    {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}