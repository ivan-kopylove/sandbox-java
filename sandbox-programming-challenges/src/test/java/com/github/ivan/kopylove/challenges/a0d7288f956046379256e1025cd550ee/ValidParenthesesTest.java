package com.github.ivan.kopylove.challenges.a0d7288f956046379256e1025cd550ee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest
{
    private final ValidParenthesesSolutionV1 sutv1 = new ValidParenthesesSolutionV1();
    private final ValidParenthesesSolutionV2 sutv2 = new ValidParenthesesSolutionV2();

    @Test
    void should_satisfy_parenthesis_check()
    {
        assertTrue(sutv1.isValid("()"));
        assertTrue(sutv1.isValid("()[]{}"));
        assertFalse(sutv1.isValid("(]"));
        assertFalse(sutv1.isValid("["));
        assertFalse(sutv1.isValid("]]"));
    }
}
