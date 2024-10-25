package a9ae790504a247bbb5c26c05ec46b9e9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * boolean logic playground
 */
class RevertedIfConditionTest
{
    @SuppressWarnings({"ConstantConditions", "PointlessBooleanExpression", "DuplicateCondition"})
    @Test
    void should_produce_expected_values()
    {
        assertTrue(true && !false);
        assertFalse(true && !true);
        assertFalse(false && !true);
        assertFalse(false && !false);
    }
}