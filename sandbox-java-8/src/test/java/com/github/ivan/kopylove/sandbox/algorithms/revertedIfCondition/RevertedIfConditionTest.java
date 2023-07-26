package com.github.ivan.kopylove.sandbox.algorithms.revertedIfCondition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RevertedIfConditionTest
{

    @SuppressWarnings("ConstantConditions")
    @Test
    public void run()
    {
        Assertions.assertTrue(RevertedIfCondition.run(true, false));
        Assertions.assertFalse(RevertedIfCondition.run(true, true));
        Assertions.assertFalse(RevertedIfCondition.run(false, true));
        Assertions.assertFalse(RevertedIfCondition.run(false, false));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void run2()
    {
        Assertions.assertTrue(RevertedIfCondition.run2(true, false));
        Assertions.assertFalse(RevertedIfCondition.run2(true, true));
        Assertions.assertFalse(RevertedIfCondition.run2(false, true));
        Assertions.assertFalse(RevertedIfCondition.run2(false, false));
    }
}
