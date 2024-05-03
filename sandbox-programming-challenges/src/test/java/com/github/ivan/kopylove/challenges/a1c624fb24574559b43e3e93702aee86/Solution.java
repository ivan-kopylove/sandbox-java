package com.github.ivan.kopylove.challenges.a1c624fb24574559b43e3e93702aee86;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/submissions/931762688/">22. Generate Parentheses</a>
 */
class Solution
{
    public List<String> generateParenthesis(int n)
    {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }

    private void generate(List<String> result, String str, int left, int right, int max)
    {
        if (str.length() == max * 2)
        {
            result.add(str);
            return;
        }

        if (left < max)
        {
            generate(result, str + "(", left + 1, right, max);
        }

        if (left > right)
        {
            generate(result, str + ")", left, right + 1, max);
        }
    }
}