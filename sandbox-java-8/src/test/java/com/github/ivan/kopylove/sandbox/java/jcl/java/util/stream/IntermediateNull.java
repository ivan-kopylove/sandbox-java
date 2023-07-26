package com.github.ivan.kopylove.sandbox.java.jcl.java.util.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateNull
{

    @Test
    public void a()
    {
        List<Object> mapped = Stream.of("1", "2")
                                    .map(s -> null)
                                    .peek(System.out::println)
                                    .collect(Collectors.toList());

        Assertions.assertNull(mapped.get(0));
        Assertions.assertNull(mapped.get(1));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void b()
    {
        List<Object> mapped = Stream.of("1", "2")
                                    .map(s -> null)
                                    .filter(Objects::nonNull) //this helps
                                    .peek(System.out::println)
                                    .collect(Collectors.toList());

        Assertions.assertEquals(0, mapped.size());
    }
}
