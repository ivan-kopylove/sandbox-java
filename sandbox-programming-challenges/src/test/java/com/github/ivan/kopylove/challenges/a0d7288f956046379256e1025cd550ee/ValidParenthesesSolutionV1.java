package com.github.ivan.kopylove.challenges.a0d7288f956046379256e1025cd550ee;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/submissions/458753197/">20. Valid Parentheses</a>
 */
class ValidParenthesesSolutionV1
{
    public boolean isValid(String s)
    {
        String closers = "";

        for (char mychar : s.toCharArray())
        {
            if (mychar == '{')
            {
                closers = '}' + closers;
            }
            if (mychar == '(')
            {
                closers = ')' + closers;
            }
            if (mychar == '[')
            {
                closers = ']' + closers;
            }
            if (mychar == '}')
            {
                if (closers.length() > 0 && closers.charAt(0) == '}')
                {
                    closers = closers.substring(1);
                }
                else
                {
                    return false;
                }
            }

            if (mychar == ')')
            {
                if (closers.length() > 0 && closers.charAt(0) == ')')
                {
                    closers = closers.substring(1);
                }
                else
                {
                    return false;
                }
            }

            if (mychar == ']')
            {
                if (closers.length() > 0 && closers.charAt(0) == ']')
                {
                    closers = closers.substring(1);
                }
                else
                {
                    return false;
                }
            }
        }
        return closers.length() == 0;
    }
}