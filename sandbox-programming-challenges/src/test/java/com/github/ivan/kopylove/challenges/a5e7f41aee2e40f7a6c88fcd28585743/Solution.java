package com.github.ivan.kopylove.challenges.a5e7f41aee2e40f7a6c88fcd28585743;

/**
 * <a href="https://leetcode.com/problems/count-and-say/submissions/931409158/">38. Count and Say</a>
 */
class Solution
{
    public String countAndSay(int n)
    {
        if (n == 1)
        {
            return "1";
        }

        String previous = "1";

        for (int i = 2; i <= n; i++)
        {
            previous = convert(previous);
        }

        return previous;
    }

    private String convert(String val)
    {
        System.out.println(val);
        String result = "";
        char current = val.charAt(0);
        int counter = 0;
        for (int i = 0; i < val.length(); i++)
        {
            if (current != val.charAt(i))
            {
                result += counter + String.valueOf(current);
                counter = 0;
            }
            counter++;
            current = val.charAt(i);
        }

        result += counter + String.valueOf(current);
        return result;
    }
}