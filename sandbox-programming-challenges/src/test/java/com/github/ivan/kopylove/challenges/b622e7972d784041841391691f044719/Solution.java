package com.github.ivan.kopylove.challenges.b622e7972d784041841391691f044719;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;

/**
 * <a href="https://leetcode.com/problems/finding-the-users-active-minutes/submissions/947127547/">1817. Finding the Users Active Minutes.</a>
 */
class Solution
{
    public int[] findingUsersActiveMinutes(int[][] logs, int k)
    {
        int[] result = new int[k];

        Map<Integer, Integer> usersMinutes = Arrays.stream(logs)
                                                   .collect(groupingBy(log -> log[0],
                                                                       collectingAndThen(Collectors.toSet(), set -> {
                                                                                             Map<Integer, List<int[]>> a = set.stream()
                                                                                                                              .collect(
                                                                                                                                      groupingBy(
                                                                                                                                              l -> l[1]));

                                                                                             return a.size() - 1;
                                                                                         }

                                                                       )));


        for (Map.Entry<Integer, Integer> userMinute : usersMinutes.entrySet())
        {
            System.out.println("userMinute: " + userMinute.getValue());
            result[userMinute.getValue()]++;
        }


        return result;
    }
}