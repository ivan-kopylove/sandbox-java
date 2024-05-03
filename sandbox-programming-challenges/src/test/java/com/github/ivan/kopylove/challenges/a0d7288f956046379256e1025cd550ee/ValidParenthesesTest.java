package com.github.ivan.kopylove.challenges.a0d7288f956046379256e1025cd550ee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest
{
    private final ValidParenthesesSolution sut = new ValidParenthesesSolution();

    @Test
    void should_satisfy_parenthesis_check()
    {
        assertTrue(sut.isValid("()"));
        assertTrue(sut.isValid("()[]{}"));
        assertFalse(sut.isValid("(]"));
    }
}
