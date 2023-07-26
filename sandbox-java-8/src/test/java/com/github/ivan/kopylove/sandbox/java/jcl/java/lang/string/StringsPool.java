package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Basic demonstration of strings pool in java. Strings are compared intentionally using reference equality.
 */
public class StringsPool
{
    @Test
    public void test1()
    {
        String a = "012"; //goes into strings pool
        String b = "012"; //goes into strings pool
        String c = "0" + "1" + "2"; //goes into strings pool

        String d = null; // value is calculated
        for (int i = 0; i <= 2; i++)
        {
            d += i;
        }

        Assertions.assertSame(a, b);
        Assertions.assertSame(c, a);
        Assertions.assertSame(c, b);


        Assertions.assertNotSame(d, a);
        Assertions.assertNotSame(d, b);
        Assertions.assertNotSame(d, c);
    }

    @Test
    public void test2()
    {
        String a = "012";
        String b = "012";
        Assertions.assertNotSame(a, b);
    }

    @Test
    public void test3()
    {
        String a = "012";
        String b = "012";
        Assertions.assertNotSame(a, b);
        Assertions.assertNotSame(a, b.intern());
    }

    @Test
    public void test4()
    {
        String a = "012";
        String b = "012";
        Assertions.assertSame(a.intern(), b.intern());
    }

    @Test
    public void test5()
    {
        String a = "012";
        String b = "012";
        Assertions.assertSame(a, b.intern());
    }
}
