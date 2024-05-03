package com.github.ivan.kopylove.challenges.a9fdba1675c0428f880cd275f730a932;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/add-binary/submissions/883169388/">67. Add Binary</a>
 */
class Solution
{
    public String addBinary(String a, String b)
    {
        boolean overflow = false;
        String result = "";

        int biggerArraySize = a.length() > b.length() ? a.length() : b.length();

        boolean[] aPlaces = new boolean[biggerArraySize];
        boolean[] bPlaces = new boolean[biggerArraySize];

        for (int i = aPlaces.length - 1, j = a.length() - 1; j >= 0; i--, j--)
        {
            if (a.charAt(j) == '1')
            {
                aPlaces[i] = true;
            }
        }

        for (int i = bPlaces.length - 1, j = b.length() - 1; j >= 0; i--, j--)
        {
            if (b.charAt(j) == '1')
            {
                bPlaces[i] = true;
            }
        }

        System.out.println(Arrays.toString(aPlaces));
        System.out.println(Arrays.toString(bPlaces));

        for (int i = biggerArraySize - 1; i >= 0; i--)
        {
            if (aPlaces[i] && bPlaces[i] && !overflow)
            {
                result = "0" + result;
                overflow = true;
            }

            else if (aPlaces[i] && !bPlaces[i] && !overflow)
            {
                result = "1" + result;
                overflow = false;
            }

            else if (!aPlaces[i] && bPlaces[i] && !overflow)
            {
                result = "1" + result;
                overflow = false;
            }

            else if (!aPlaces[i] && !bPlaces[i] && !overflow)
            {
                result = "0" + result;
                overflow = false;
            }

            else if (aPlaces[i] && bPlaces[i] && overflow)
            {
                result = "1" + result;
                overflow = true;
            }

            else if (aPlaces[i] && !bPlaces[i] && overflow)
            {
                result = "0" + result;
                overflow = true;
            }

            else if (!aPlaces[i] && bPlaces[i] && overflow)
            {
                result = "0" + result;
                overflow = true;
            }

            else if (!aPlaces[i] && !bPlaces[i] && overflow)
            {
                result = "1" + result;
                overflow = false;
            }
        }

        if (overflow)
        {
            result = "1" + result;
        }


        return result;
    }
}