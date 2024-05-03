package com.github.ivan.kopylove.challenges.d79b5ea6ee3d468b8ff28dfb9c6cc25a;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PredicateExample
{
    @Test
    void run()
    {
        Stream<String> myStream = Stream.of("a", "b", "c");

        List<String> result = myStream.filter(com.github.ivan.kopylove.challenges.d79b5ea6ee3d468b8ff28dfb9c6cc25a.PredicateCreator.build(a -> a.equalsIgnoreCase("a")))
                                      .collect(Collectors.toList());

        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }
}
