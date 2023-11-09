package dsadasdsadasd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Assignment vs equals
 * facets:
 * - exercises
 * - fixme
 * - koan
 */
class AssignmentVsEquals
{
    @Test
    public void dsa()
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