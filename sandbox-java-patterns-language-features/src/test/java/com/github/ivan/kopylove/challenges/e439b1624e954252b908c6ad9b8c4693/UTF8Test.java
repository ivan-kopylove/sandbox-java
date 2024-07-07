package com.github.ivan.kopylove.challenges.e439b1624e954252b908c6ad9b8c4693;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UTF8Test
{
    @Test
    void test()
    {
        String umlaut = "Ä";
        assertEquals(umlaut, "Ä");
        assertEquals(umlaut, "\u00c4");
    }
}
