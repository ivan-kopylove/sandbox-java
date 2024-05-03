package com.github.ivan.kopylove.challenges.a64dcd966c16475da40d42a8d797fd54;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/submissions/923536153/">88. Merge Sorted Array</a>
 */
class Solution
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int cursor1 = m - 1;
        int cursor2 = n - 1;
        int backwardCursor = n + m - 1;

        while (cursor1 >= 0 && cursor2 >= 0)
        {
            if (nums1[cursor1] > nums2[cursor2])
            {
                nums1[backwardCursor] = nums1[cursor1];
                cursor1--;
            }
            else
            {
                nums1[backwardCursor] = nums2[cursor2];
                cursor2--;
            }

            backwardCursor--;
        }

        while (cursor2 >= 0)
        {
            nums1[backwardCursor] = nums2[cursor2];
            backwardCursor--;
            cursor2--;
        }
    }
} 