package ad125ec89ce8e38a0f7c0da18591a4880;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EnumExceptionTest
{
    @Test
    void exceptionNonExistingEnumValue()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            EnumToString.valueOf("some non-existing value");
        });
    }

    @Test
    void enumToString()
    {
        EnumToString myValue1 = EnumToString.MY_VALUE;
        String myValue2 = EnumToString.MY_VALUE.toString();
        String myValue3 = EnumToString.MY_VALUE.name();
        String myValue4 = EnumToString.MY_VALUE.getEnumValue();

        assertEquals(EnumToString.MY_VALUE, myValue1);
        assertEquals("MY_VALUE", myValue2);
        assertEquals("MY_VALUE", myValue3);
        assertEquals("QWERTY", myValue4);
    }
}
