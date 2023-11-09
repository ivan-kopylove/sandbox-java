package e439b1624e954252b908c6ad9b8c4693;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Basic demonstration of strings pool in java. Strings are compared intentionally using reference equality.
 */
class StringsPoolTest
{
    @Test
    void test1()
    {
        String a = "012"; //goes into strings pool
        String b = "012"; //goes into strings pool
        String c = "0" + "1" + "2"; //goes into strings pool

        String d = null; // value is calculated
        for (int i = 0; i <= 2; i++)
        {
            d += i;
        }

        assertSame(a, b);
        assertSame(c, a);
        assertSame(c, b);


        assertNotSame(d, a);
        assertNotSame(d, b);
        assertNotSame(d, c);
    }

    @Test
    void test2()
    {
        String a = "012";
        String b = "012";
        assertNotSame(a, b);
    }

    @Test
    void test3()
    {
        String a = "012";
        String b = "012";
        assertNotSame(a, b);
        assertNotSame(a, b.intern());
    }

    @Test
    void test4()
    {
        String a = "012";
        String b = "012";
        assertSame(a.intern(), b.intern());
    }

    @Test
    void test5()
    {
        String a = "012";
        String b = "012";
        assertSame(a, b.intern());
    }
}
