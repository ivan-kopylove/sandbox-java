package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UTF8Test
{
    @Test
    public void test()
    {
        String umlaut = "Ä";
        assertEquals(umlaut, "Ä");
        assertEquals(umlaut, "\u00c4");
    }
}
