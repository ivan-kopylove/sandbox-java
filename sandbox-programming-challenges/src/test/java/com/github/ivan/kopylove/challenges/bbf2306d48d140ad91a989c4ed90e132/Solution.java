package com.github.ivan.kopylove.challenges.bbf2306d48d140ad91a989c4ed90e132;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/sort-the-students-by-their-kth-score/submissions/997399267/">2545. Sort the Students by Their Kth Score</a>
 */
class Solution
{
    public int[][] sortTheStudents(int[][] score, int k)
    {
        Arrays.sort(score, (o1, o2) -> o2[k] - o1[k]);
        return score;
    }
}