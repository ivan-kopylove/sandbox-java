package com.github.ivan.kopylove.challenges.c9deed6c7f634c9bbea2e2397121b3d3;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * The default implementation of smth.
 */
class Dsad
{
    @Test
    void streamWithoutTerminalOperationIsNotExecuted()
    {
        AtomicBoolean result = new AtomicBoolean(false);
        Stream.of("a", "b")
              .map(Function.identity())
              .peek(s -> {
                  System.out.println(s);
                  result.set(true);
              });
        assertFalse(result.get());
    }
}
