package com.github.ivan.kopylove.sandbox.java.jcl.java.util.date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateToString
{
    @Test
    public void test()
    {
        Date date = new Date(555555555555L);
        Assertions.assertEquals(date.toString(), "Mon Aug 10 04:59:15 MSD 1987");
        Assertions.assertEquals(date.getTime(), 555555555555L);
    }
}
