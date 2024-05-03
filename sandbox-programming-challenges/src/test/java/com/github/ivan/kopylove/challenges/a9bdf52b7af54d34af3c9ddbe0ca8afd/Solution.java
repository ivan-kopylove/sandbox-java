package com.github.ivan.kopylove.challenges.a9bdf52b7af54d34af3c9ddbe0ca8afd;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/plus-one/submissions/485800176/">66. Plus One</a>
 */
class Solution
{
    public int[] plusOne(int[] digits)
    {
        int digitsLength = digits.length;

        int overflow = digits[digitsLength - 1] == 9 ? 1 : 0;

        if (overflow == 0)
        {
            digits[digitsLength - 1]++;
        }
        else
        {
            int backwardsPointer = 0;

            while (overflow != 0)
            {
                if (digitsLength - 1 - backwardsPointer < 0)
                {
                    System.out.println("Array size is not enough.");
                    int[] newArray = new int[digitsLength + 1];
                    System.arraycopy(digits, 0, newArray, 1, digitsLength);
                    newArray[0] = 1;
                    return newArray;
                }

                if (digits[digitsLength - 1 - backwardsPointer] == 9)
                {
                    digits[digitsLength - 1 - backwardsPointer] = 0;
                    overflow = 1;
                }
                else
                {
                    digits[digitsLength - 1 - backwardsPointer]++;
                    overflow = 0;
                }
                backwardsPointer++;
            }
        }

        System.out.println(Arrays.toString(digits));
        return digits;
    }
}