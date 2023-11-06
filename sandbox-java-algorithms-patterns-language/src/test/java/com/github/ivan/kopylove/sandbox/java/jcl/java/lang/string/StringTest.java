package com.github.ivan.kopylove.sandbox.java.jcl.java.lang.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void testException()
    {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {

            String s = "0123456789_A";
            int endIndex = "qwee".lastIndexOf("_________"); //returns -1
            s.substring(0, endIndex); //throws exception
        });
    }

    @Test
    public void lastIndexOf1()
    {
        int lastIndex = "abcdab".lastIndexOf("a");
        Assertions.assertEquals(4, lastIndex);
    }

    @Test
    public void lastIndexOf11()
    {
        int lastIndex = "abcdab".lastIndexOf("a");
        Assertions.assertEquals(4, lastIndex);
    }

    @Test
    public void lastIndexOf2()
    {
        int lastIndex = "abcdab".lastIndexOf("a", 2);
        Assertions.assertEquals(0, lastIndex);
    }
}