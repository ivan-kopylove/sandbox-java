package heap.a627fda5cd97fa7f4516d2744b027a9c4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Boolean logic playground.
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