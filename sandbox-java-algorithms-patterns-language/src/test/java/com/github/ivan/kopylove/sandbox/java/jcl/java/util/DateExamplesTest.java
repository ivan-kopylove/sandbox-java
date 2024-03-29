package com.github.ivan.kopylove.sandbox.java.jcl.java.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateExamplesTest
{
    /**
     * Date#before method exists in JCL.
     */
    @Test
    public void run() throws InstantiationException
    {
        Date date = new Date(1561165200000L); //Saturday, June 22, 2019 4:00:00 AM GMT+03:00
        Date date2 = new Date(1529629200000L); //Friday, June 22, 2018 4:00:00 AM GMT+03:00
        Assertions.assertTrue(date2.before(date));
    }
}