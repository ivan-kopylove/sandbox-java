package com.github.ivan.kopylove.sandbox.algorithms.revertedIfCondition;

import org.junit.jupiter.api.Test;

import static com.github.ivan.kopylove.sandbox.algorithms.revertedIfCondition.RevertedIfCondition.revertedIfConditionExampleOne;
import static com.github.ivan.kopylove.sandbox.algorithms.revertedIfCondition.RevertedIfCondition.revertedIfConditionExampleTwo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RevertedIfConditionTest
{

    @SuppressWarnings("ConstantConditions")
    @Test
    public void run()
    {
        assertTrue(revertedIfConditionExampleOne(true, false));
        assertFalse(revertedIfConditionExampleOne(true, true));
        assertFalse(revertedIfConditionExampleOne(false, true));
        assertFalse(revertedIfConditionExampleOne(false, false));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void run2()
    {
        assertTrue(revertedIfConditionExampleTwo(true, false));
        assertFalse(revertedIfConditionExampleTwo(true, true));
        assertFalse(revertedIfConditionExampleTwo(false, true));
        assertFalse(revertedIfConditionExampleTwo(false, false));
    }
}
