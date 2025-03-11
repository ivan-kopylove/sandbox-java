package heap.a24ff7f3d9174116961e97357eb9f235d;

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
    void class_should_be_with_default_values_of_fields()
    {
        SomeClass defaultValues = new SomeClass();

        assertNull(defaultValues.str);
        assertEquals(defaultValues.myInt, 0);
        assertFalse(defaultValues.myBool);
    }

    @Test
    void array_should_be_initialized_with_zeroes()
    {
        int[] array = new int[3];//initialized with zeros

        assertEquals(0, array[0]);
        assertEquals(0, array[1]);
        assertEquals(0, array[2]);
    }
}
