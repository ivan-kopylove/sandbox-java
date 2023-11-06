package com.github.ivan.kopylove.sandbox.algorithms.revertedIfCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RevertedIfConditionTest
{

    @SuppressWarnings("ConstantConditions")
    @Test
    public void run()
    {
        assertTrue(RevertedIfCondition.run(true, false));
        assertFalse(RevertedIfCondition.run(true, true));
        assertFalse(RevertedIfCondition.run(false, true));
        assertFalse(RevertedIfCondition.run(false, false));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void run2()
    {
        assertTrue(RevertedIfCondition.run2(true, false));
        assertFalse(RevertedIfCondition.run2(true, true));
        assertFalse(RevertedIfCondition.run2(false, true));
        assertFalse(RevertedIfCondition.run2(false, false));
    }
}
