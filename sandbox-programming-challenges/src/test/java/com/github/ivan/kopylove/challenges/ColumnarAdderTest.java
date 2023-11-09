package com.github.ivan.kopylove.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static java.lang.System.arraycopy;
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

    class ColumnarAdder
    {
        private static final String REGEX = "[0-9]+";

        public String sum(String s1, String s2)
        {
            if (!(s1.matches(REGEX) && s2.matches(REGEX)))
            {
                throw new RuntimeException("invalid string");
            }

            boolean overflow = false;

            int maxLength = Math.max(s1.length(), s2.length());

            int[] n1 = new int[maxLength];
            int[] n2 = new int[maxLength];

            for (int i = n1.length - 1, j = s1.length() - 1; j > -1; i--, j--)
            {
                n1[i] = Character.getNumericValue(s1.charAt(j));
            }
            for (int i = n2.length - 1, j = s2.length() - 1; j > -1; i--, j--)
            {
                n2[i] = Character.getNumericValue(s2.charAt(j));
            }

            int[] result = new int[maxLength + 1];

            for (int i = n1.length - 1; i > -1; i--)
            {
                int sum = n1[i] + n2[i];

                if (overflow)
                {
                    sum++;
                    overflow = false;
                }

                if (sum > 9)
                {
                    overflow = true;
                    result[i + 1] = sum % 10;
                }
                else
                {
                    result[i + 1] = sum;
                }
            }


            if (overflow)
            {
                result[0] = 1;
                return toPlainString(result);
            }
            else
            {
                int[] cutResult = new int[maxLength];
                arraycopy(result, 1, cutResult, 0, result.length - 1);
                return toPlainString(cutResult);
            }
        }

        public String toPlainString(int[] nums)
        {
            return Arrays.stream(nums)
                         .mapToObj(String::valueOf)
                         .collect(Collectors.joining(""));
        }
    }
}