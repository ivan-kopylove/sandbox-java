package com.github.ivan.kopylove.sandbox.java.jcl.java.util.function;

import com.github.ivan.kopylove.sandbox.java.jcl.util.function.PredicateCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample
{
    @Test
    public void run()
    {
        Stream<String> myStream = Stream.of("a", "b", "c");

        List<String> result = myStream.filter(PredicateCreator.build(a -> a.equalsIgnoreCase("a")))
                                      .collect(Collectors.toList());

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("a", result.get(0));
    }
}
