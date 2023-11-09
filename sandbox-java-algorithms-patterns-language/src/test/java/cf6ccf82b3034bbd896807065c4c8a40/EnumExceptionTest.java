package cf6ccf82b3034bbd896807065c4c8a40;

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
