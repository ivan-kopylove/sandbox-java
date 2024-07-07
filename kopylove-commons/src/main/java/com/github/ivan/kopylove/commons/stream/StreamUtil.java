package com.github.ivan.kopylove.commons.stream;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.util.Objects.requireNonNull;
import static java.util.Spliterator.ORDERED;
import static java.util.Spliterators.spliteratorUnknownSize;

public class StreamUtil
{
    public static <T> Stream<T> iteratorToStream(Iterator<T> iterator)
    {
        requireNonNull(iterator);
        return StreamSupport.stream(spliteratorUnknownSize(iterator, ORDERED), false);
    }
}
