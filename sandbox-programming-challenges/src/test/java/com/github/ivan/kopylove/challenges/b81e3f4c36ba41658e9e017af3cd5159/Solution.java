package com.github.ivan.kopylove.challenges.b81e3f4c36ba41658e9e017af3cd5159;

/**
 * <a href="https://leetcode.com/problems/goal-parser-interpretation/submissions/959576621/">1678. Goal Parser Interpretation</a>
 */
class Solution
{
    public String interpret(String command)
    {


        return command.replace("()", "o")
                      .replace("(al)", "al");
    }
}