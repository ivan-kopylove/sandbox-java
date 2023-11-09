package d19118ab94334147a5829b3422c505d5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Purpose: to demonstrate object properties default values
 */
class DefaultValuesClassTest
{
    @Test
    void objectDefaultValues()
    {
        DefaultValuesClass defaultValues = new DefaultValuesClass();

        assertNull(defaultValues.str);
        assertEquals(defaultValues.myInt, 0);
        assertFalse(defaultValues.myBool);
    }

    @Test
    void objectDefaultValues2()
    {
        int[] array = new int[3];//initialized with zeros

        assertEquals(0, array[0]);
        assertEquals(0, array[1]);
        assertEquals(0, array[2]);
    }
}
