package com.github.ivan.kopylove.challenges.be20b2775cb74888b3a8d7899390f1f5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * The `Example 2` is expected to be the same as `Example 1`, what's wrong?
 */
public class PredicateLogicTrickyCaseTest
{

    private static Stream<Arguments> testCases()
    {
        return Stream.of(Arguments.of(4, 4));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void example1(int a, int b)
    {
        int result = 0;

        if (a > b)
        {
            result = 20;
        }
        else
        {
            result = 10;
        }

        //        fail("try to check yourself before running the assertion");
        assertThat(10, equalTo(result));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void example2(int a, int b)
    {
        int result = 0;
        if (a < b)
        {
            result = 10;
        }
        else
        {
            result = 20;
        }

        //        fail("try to check yourself before running the assertion");
        assertThat(20, equalTo(result));
    }
}
