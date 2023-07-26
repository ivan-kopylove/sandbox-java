package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringFormat
{
    @Test
    public void main()
    {
        String s = "\u221E \u0020sometext";
        System.out.println(s);
        Assertions.assertEquals("∞  sometext", s);
    }
}
