package com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

/**
 * java streams playground
 * <p>
 * The default implementation of smth.
 */
class StreamSortTest
{
    /**
     * Strategy how to handle nulls inside the comparator.
     */
    @Test
    void nullSafeChainedLambdaComparator()
    {
        List<ComparableObject> list = DataProvider.createObjectsWithNulls();
        list.sort(Comparator.nullsLast(Comparator.comparing(ComparableObject::getDate))
                            .thenComparing(Comparator.nullsLast(Comparator.comparing(ComparableObject::getStr))));
    }

    /**
     * First it sorts by date. If dates are equals, it sorts by string.
     */
    @Test
    void chainedLambdaComparator()
    {
        List<ComparableObject> list = DataProvider.createObjects();
        list.sort(Comparator.comparing(ComparableObject::getDate)
                            .thenComparing(ComparableObject::getStr));
    }
}
