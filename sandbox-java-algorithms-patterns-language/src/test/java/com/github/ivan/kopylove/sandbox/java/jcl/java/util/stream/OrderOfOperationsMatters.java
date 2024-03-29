package com.github.ivan.kopylove.sandbox.java.jcl.java.util.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderOfOperationsMatters
{

    public static void orderOfOperationsMatters()
    {
        List<String> result1 = Stream.of("1", "22", "333")
                                     .map(s -> s + "-postfix")
                                     .filter(s -> s.length() > 1)
                                     .collect(Collectors.toList());

        List<String> result2 = Stream.of("1", "22", "333")
                                     .filter(s -> s.length() > 1)
                                     .map(s -> s + "-postfix")
                                     .collect(Collectors.toList());

        Assertions.assertEquals(3, result1.size());
        Assertions.assertEquals(2, result2.size());
    }

    @Test
    public void main()
    {
        orderOfOperationsMatters();
    }
}
