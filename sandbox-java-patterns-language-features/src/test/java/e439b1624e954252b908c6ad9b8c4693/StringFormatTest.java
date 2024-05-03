package com.github.ivan.kopylove.challenges.e439b1624e954252b908c6ad9b8c4693;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringFormatTest
{
    @Test
    void main()
    {
        String s = "\u221E \u0020sometext";
        System.out.println(s);
        assertEquals("∞  sometext", s);
    }
}
