package ef9219a1ac684510a1b5e5b03f2bc9cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * facets:
 * - algorithms
 * - custom-index
 * - math
 * - zero-result-by-division
 * - hashmap
 */
class TwoSumTest
{
    private final TwoSumSolutionV1 sut1 = new TwoSumSolutionV1();
    private final TwoSumSolutionV2 sut2 = new TwoSumSolutionV2();

    private static Stream<Arguments> testCases()
    {
        return Stream.of(Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                         Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                         Arguments.of(new int[]{2, 5, 5, 11}, 10, new int[]{1, 2}),
                         Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void two_sum_test_v1(int[] nums, int target, int[] expected)
    {
        // then
        assertThat(sut1.twoSum(nums, target), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void two_sum_test_v2(int[] nums, int target, int[] expected)
    {
        // then
        assertThat(sut2.twoSum(nums, target), equalTo(expected));
    }

    /**
     * <a href="https://leetcode.com/problems/two-sum/submissions/443665791/">submission</a>
     */
    private static class TwoSumSolutionV2
    {
        public int[] twoSum(int[] nums, int target)
        {
            Map<Integer, Integer> index = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
            {
                index.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++)
            {
                Integer foundIndex = index.get(target - nums[i]);
                if (foundIndex != null && foundIndex != i)
                {
                    return new int[]{i, foundIndex};
                }
            }

            throw new RuntimeException();
        }
    }

    /**
     * <a href="https://leetcode.com/problems/two-sum/submissions/443662261/">submission</a>
     */
    private static class TwoSumSolutionV1
    {
        public int[] twoSum(int[] nums, int target)
        {
            for (int i = 0; i < nums.length; i++)
            {
                for (int j = 1; j < nums.length; j++)
                {
                    if (i != j)
                    {
                        if (nums[i] + nums[j] == target)
                        {
                            int[] result = new int[2];
                            result[0] = i;
                            result[1] = j;
                            return result;
                        }
                    }
                }
            }
            return new int[2];
        }
    }
}