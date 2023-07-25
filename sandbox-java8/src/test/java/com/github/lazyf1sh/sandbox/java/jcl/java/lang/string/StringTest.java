package com.github.lazyf1sh.sandbox.java.jcl.java.lang.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest
{
    @Test
    public void test()
    {
        String s = "0123456789_A";

        assertEquals("0123", s.substring(0, 4));
        assertEquals("456789", s.substring(4, 10));
        assertEquals("1" + null, "1null");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testException()
    {

        String s = "0123456789_A";
        int endIndex = "qwee".lastIndexOf("_________"); //returns -1
        s.substring(0, endIndex); //throws exception
    }

    @Test
    public void lastIndexOf1()
    {
        int lastIndex = "abcdab".lastIndexOf("a");
        Assert.assertEquals(4, lastIndex);
    }

    @Test
    public void lastIndexOf11()
    {
        int lastIndex = "abcdab".lastIndexOf("a");
        Assert.assertEquals(4, lastIndex);
    }

    @Test
    public void lastIndexOf2()
    {
        int lastIndex = "abcdab".lastIndexOf("a", 2);
        Assert.assertEquals(0, lastIndex);
    }
}