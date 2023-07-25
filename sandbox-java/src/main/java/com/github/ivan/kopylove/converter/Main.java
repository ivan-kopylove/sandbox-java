package com.github.ivan.kopylove.converter;/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:
Input: [0,12,0,1,3]
Output: [12,1,3,0,0]

Constraints:
1 <= nums.length <= 10^4
-2^-31 <= nums[i] <= 2^31 - 1

without any additional structures
no System.arrayCopy(
no tricky comparators
in place

variables and flags are prohibited
*/

import java.util.Arrays;

public class Main
{

    private static void moveZeroes(int[] nums)
    {
        int dest = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                nums[dest] = nums[i];
                dest++;
            }
        }

        for (int i = dest; i < nums.length; i++)
        {
            nums[i] = 0;
        }
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{0, 12, 1, 3, 0};
        int[] nums2 = new int[]{0, 0, 12, 1, 3, 0};
        moveZeroes(nums);
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        check(new int[]{12, 1, 3, 0, 0}, nums);
        check(new int[]{12, 1, 3, 0, 0, 0}, nums2);
    }

    private static void check(int[] expected, int[] actual)
    {
        if (!Arrays.equals(expected, actual))
        {
            throw new IllegalStateException("expected " + Arrays.toString(expected) + ", actual  " + Arrays.toString(
                    actual));
        }
    }
}