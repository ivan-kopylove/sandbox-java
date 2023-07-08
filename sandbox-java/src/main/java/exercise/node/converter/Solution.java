package exercise.node.converter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result = new int[k];

        Map<Integer, List<int[]>> collect = Arrays.stream(logs)
                .collect(Collectors.groupingBy(log -> log[0]));

        return result;
    }
}