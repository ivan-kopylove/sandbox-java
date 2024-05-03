package com.github.ivan.kopylove.challenges.c7913c84591f48bcb323933a1d62bf87;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.System.arraycopy;

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