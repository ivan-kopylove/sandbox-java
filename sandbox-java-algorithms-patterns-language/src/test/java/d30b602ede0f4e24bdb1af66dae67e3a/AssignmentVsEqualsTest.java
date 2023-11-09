package d30b602ede0f4e24bdb1af66dae67e3a;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Assignment vs equals
 * facets:
 * - exercises
 * - fixme
 * - koan
 */
class AssignmentVsEqualsTest
{
    @Test
    void dsa()
    {
        boolean x = true;
        boolean y = false;
        while (x = y)// should be x == y
        {
            Assertions.fail();
        }
        Assertions.assertTrue(true);
    }
}