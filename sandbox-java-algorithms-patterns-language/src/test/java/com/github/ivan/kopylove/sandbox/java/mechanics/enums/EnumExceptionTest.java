package com.github.ivan.kopylove.sandbox.java.mechanics.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EnumExceptionTest
{
    @Test
    public void exceptionNonExistingEnumValue()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            EnumToString.valueOf("some non-existing value");
        });
    }

    @Test
    public void enumToString()
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
