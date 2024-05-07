package com.github.ivan.kopylove.challenges.ef9219a1ac684510a1b5e5b03f2bc9cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * facets:
 * - algorithms
 * - custom-index
 * - math
 * - zero-result-by-division
 * - hashmap
 */
class TwoSumSolutionTest
{
    private final TwoSumSolutionV1 sut1 = new TwoSumSolutionV1();
    private final TwoSumSolutionV2 sut2 = new TwoSumSolutionV2();
    private final TwoSumSolutionV3 sut3 = new TwoSumSolutionV3();
    private final TwoSumSolutionV4 sut4 = new TwoSumSolutionV4();

    private static Stream<Arguments> testCases()
    {
        return Stream.of(Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                         Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                         Arguments.of(new int[]{2, 5, 5, 11}, 10, new int[]{1, 2}),
                         Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                         Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void two_sum_test(int[] nums, int target, int[] expected)
    {
        // then
        assertThat("solution version 1", sut1.twoSum(nums, target), equalTo(expected));
        assertThat("solution version 2", sut2.twoSum(nums, target), equalTo(expected));
        assertThat("solution version 3", sut3.twoSum(nums, target), equalTo(expected));
        assertThat("solution version 4", sut4.twoSum(nums, target), equalTo(expected));
    }
}