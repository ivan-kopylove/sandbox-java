package com.github.ivan.kopylove.challenges.acb78671393f43a9bf2e915b22538f0e;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/4sum-ii/submissions/448139952/">454. 4Sum II</a>
 */
class Solution
{
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D)
    {
        System.out.println("A size: " + A.length);
        System.out.println("B size: " + B.length);
        System.out.println("C size: " + C.length);
        System.out.println("D size: " + D.length);


        int sum = 0;
        //main problem: get rid of nested loops


        //idea #1: bruteforce (result: slow)
        //idea #2: bruteforce with storing intermediate result (result: faster, but not enough). The deeper loop, the more useless operations are done.
        //idea #3: cache vectors of indexes representing intermediate sums
        //idea #4: use some mathmematical hack

        //idea #4: in progress - O(2 * (2^2)); 47 / 48 test cases passed. Submission Result: Time Limit Exceeded 
        List<Integer> abSum = new ArrayList<>();
        Map<Integer, Integer> cdSum = new HashMap<>();

        for (Integer i = 0; i < A.length; i++)
        {
            int aValue = A[i];
            int cValue = C[i];
            for (Integer j = 0; j < A.length; j++)
            {
                abSum.add((aValue + B[j]) * -1); //e.g.: (5 + 2) * -1 = -7

                Integer calculated = (cValue + D[j]); //e.g: -4 + (-3) = -7
                Integer result = cdSum.get(calculated);

                if (result != null)
                {
                    cdSum.put(calculated, ++result); //key: (-7) | result: 1 or more
                }
                else
                {
                    cdSum.put(calculated, 1);
                }
            }
        }

        System.out.println("abSum: " + abSum.size());
        System.out.println("cdSum: " + cdSum.size());
        System.out.println("---");

        for (int i = 0; i < abSum.size(); i++)
        {
            Integer abSumValue = abSum.get(i);

            Integer result = cdSum.get(abSumValue);
            if (result != null)
            {
                sum += result;
            }
        }
        return sum;
    }
}