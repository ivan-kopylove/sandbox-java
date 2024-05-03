package com.github.ivan.kopylove.challenges.d576953359fa40b8802cb38f48e01afc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * <a href="https://leetcode.com/problems/integer-to-roman/submissions/920693472/">submission</a>
 * tags:
 * - algorithms
 */
class IntegerToRomanTest
{
    private final IntegerToRomanSolution sut = new IntegerToRomanSolution();

    private static Stream<Arguments> testCases()
    {
        return Stream.of(Arguments.of(3, "III"), Arguments.of(58, "LVIII"), Arguments.of(1994, "MCMXCIV"));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void integerToRomanTest(Integer input, String expected)
    {
        // then
        assertThat(sut.intToRoman(input), equalTo(expected));
    }

    private static class IntegerToRomanSolution
    {
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] M = {"", "M", "MM", "MMM"};

        public String intToRoman(int num)
        {
            return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
        }
    }
}
