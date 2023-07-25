package com.github.ivan.kopylove.sandbox.java.jcl.java.time;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Majority of java.time.* classes are immutable.
 *
 * @author Ivan Kopylov
 */
public class Immutable
{
    @Test
    public void run()
    {
        LocalDate now = LocalDate.now();
        int dayOfYear = now.getDayOfYear();

        LocalDate plus1day = now.plus(1, ChronoUnit.DAYS); //now is not modified

        Assert.assertEquals(dayOfYear, now.getDayOfYear()); //now is the same
        Assert.assertEquals(plus1day.getDayOfYear(), dayOfYear + 1);
    }

    @Test
    public void compilation_error()
    {
        //    compilation error, now parent-child relationship:
        //        LocalDateTime localDateTime = LocalDate.now();
    }
}
