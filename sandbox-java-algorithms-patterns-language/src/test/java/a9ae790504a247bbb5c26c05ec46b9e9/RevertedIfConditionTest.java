package a9ae790504a247bbb5c26c05ec46b9e9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * boolean logic playground
 */
public class RevertedIfConditionTest
{

    @SuppressWarnings("ConstantConditions")
    @Test
    public void run()
    {
        assertTrue(RevertedIfCondition.revertedIfConditionExampleOne(true, false));
        assertFalse(RevertedIfCondition.revertedIfConditionExampleOne(true, true));
        assertFalse(RevertedIfCondition.revertedIfConditionExampleOne(false, true));
        assertFalse(RevertedIfCondition.revertedIfConditionExampleOne(false, false));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void run2()
    {
        assertTrue(RevertedIfCondition.revertedIfConditionExampleTwo(true, false));
        assertFalse(RevertedIfCondition.revertedIfConditionExampleTwo(true, true));
        assertFalse(RevertedIfCondition.revertedIfConditionExampleTwo(false, true));
        assertFalse(RevertedIfCondition.revertedIfConditionExampleTwo(false, false));
    }

    private static class RevertedIfCondition
    {
        /**
         * @param a e.g.: should be done
         * @param b e.g.: but not done
         * @return true if should be done, but not done. otherwise false
         */
        public static boolean revertedIfConditionExampleOne(boolean a, boolean b)
        {
            return a && !b;
        }

        /**
         * @param a e.g.: should be done
         * @param b e.g.: but not done
         * @return true if should be done, but not done. otherwise false
         */
        public static boolean revertedIfConditionExampleTwo(boolean a, boolean b)
        {
            return a && !b;
        }
    }
}
