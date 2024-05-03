package com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EnumExceptionTest
{
    @Test
    void exceptionNonExistingEnumValue()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40.EnumToString.valueOf("some non-existing value");
        });
    }

    @Test
    void enumToString()
    {
        com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40.EnumToString myValue1 = com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40.EnumToString.MY_VALUE;
        String myValue2 = com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40.EnumToString.MY_VALUE.toString();
        String myValue3 = com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40.EnumToString.MY_VALUE.name();
        String myValue4 = com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40.EnumToString.MY_VALUE.getEnumValue();

        assertEquals(com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40.EnumToString.MY_VALUE, myValue1);
        assertEquals("MY_VALUE", myValue2);
        assertEquals("MY_VALUE", myValue3);
        assertEquals("QWERTY", myValue4);
    }
}
