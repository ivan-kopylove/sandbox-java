package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.string;

import org.junit.Assert;
import org.junit.Test;

public class StringFormat
{
    @Test
    public void main()
    {
        String s = "\u221E \u0020sometext";
        System.out.println(s);
        Assert.assertEquals("∞  sometext", s);
    }
}
