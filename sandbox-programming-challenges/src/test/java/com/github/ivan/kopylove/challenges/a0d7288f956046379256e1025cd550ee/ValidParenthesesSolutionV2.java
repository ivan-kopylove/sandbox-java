package com.github.ivan.kopylove.challenges.a0d7288f956046379256e1025cd550ee;

import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/submissions/1251606587/
 * <p>
 * Solved it myself
 */
class ValidParenthesesSolutionV2
{
    private static final Character OPENING_ROUND = '(';
    private static final Character CLOSING_ROUND = ')';

    private static final Character OPENING_RECTANGLE = '[';
    private static final Character CLOSING_RECTANGLE = ']';

    private static final Character OPENING_CURLY = '{';
    private static final Character CLOSING_CURLY = '}';

    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (Character current : s.toCharArray())
        {

            boolean match = List.of(checkValidity(current, OPENING_ROUND, CLOSING_ROUND, stack),
                                    checkValidity(current, OPENING_RECTANGLE, CLOSING_RECTANGLE, stack),
                                    checkValidity(current, OPENING_CURLY, CLOSING_CURLY, stack))
                                .stream()
                                .anyMatch(invalid -> invalid);
            if (match)
            {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean checkValidity(Character current, Character opening, Character closing, Stack<Character> stack)
    {
        if (current == opening)
        {
            stack.push(current);
        }
        else if (current == closing)
        {
            if (stack.isEmpty())
            {
                return true;
            }
            Character poppedChar = stack.pop();
            return poppedChar != opening;
        }
        return false;
    }
}