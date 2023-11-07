package com.github.ivan.kopylove.sandbox.java.jcl.java.util.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * The default implementation of smth.
 *
 * 
 */
public class Dsad
{
    @Test
    public void streamWithoutTerminalOperationIsNotExecuted()
    {
        AtomicBoolean result = new AtomicBoolean(false);
        Stream.of("a", "b")
              .map(Function.identity())
              .peek(s -> {
                  System.out.println(s);
                  result.set(true);
              });
        Assertions.assertFalse(result.get());
    }
}
