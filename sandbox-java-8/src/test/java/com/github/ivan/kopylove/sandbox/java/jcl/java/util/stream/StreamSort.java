package com.github.ivan.kopylove.sandbox.java.jcl.java.util.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

/**
 * The default implementation of smth.
 *
 * @author Ivan Kopylov
 */
public class StreamSort
{
    /**
     * Strategy how to handle nulls inside the comparator.
     */
    @Test
    public void nullSafeChainedLambdaComparator()
    {
        List<ComparableObject> list = DataProvider.createObjectsWithNulls();
        list.sort(Comparator.nullsLast(Comparator.comparing(ComparableObject::getDate))
                            .thenComparing(Comparator.nullsLast(Comparator.comparing(ComparableObject::getStr))));
    }

    /**
     * First it sorts by date. If dates are equals, it sorts by string.
     */
    @Test
    public void chainedLambdaComparator()
    {
        List<ComparableObject> list = DataProvider.createObjects();
        list.sort(Comparator.comparing(ComparableObject::getDate)
                            .thenComparing(ComparableObject::getStr));
    }
}
