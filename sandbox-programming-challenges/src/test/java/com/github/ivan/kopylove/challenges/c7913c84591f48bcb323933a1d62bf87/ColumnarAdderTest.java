package com.github.ivan.kopylove.challenges.c7913c84591f48bcb323933a1d62bf87;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ColumnarAdderTest
{
    private final ColumnarAdder     sum               = new ColumnarAdder();
    private final ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

    @Test
    void ten()
    {
        assertThat(sum.sum("6", "4"), equalTo("10"));
        assertThat(sum.sum("1994", "6"), equalTo("2000"));
        assertThat(sum.sum("1994", "26"), equalTo("2020"));
    }

    @Test
    void corner_cases()
    {
        assertThat(sum.sum("0", "0"), equalTo("0"));
        assertThat(sum.sum("1", "0"), equalTo("1"));
    }

    @Test
    void unsupported_cases()
    {
        assertThrows(RuntimeException.class, () -> assertThat(sum.sum("-1", "-1"), equalTo("-2")));
    }

    @Test
    void random()
    {

        for (int i = 0; i < 100000; i++)
        {
            long one = threadLocalRandom.nextInt(0, Integer.MAX_VALUE / 2);
            long two = threadLocalRandom.nextInt(0, Integer.MAX_VALUE / 2);

            assertThat(sum.sum(String.valueOf(one), String.valueOf(two)), equalTo(String.valueOf(one + two)));
        }
    }
}