package cf6ccf82b3034bbd896807065c4c8a40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertEquals(EnumToString.MY_VALUE, myValue1);
        Assertions.assertEquals("MY_VALUE", myValue2);
        Assertions.assertEquals("MY_VALUE", myValue3);
        Assertions.assertEquals("QWERTY", myValue4);
    }
}
