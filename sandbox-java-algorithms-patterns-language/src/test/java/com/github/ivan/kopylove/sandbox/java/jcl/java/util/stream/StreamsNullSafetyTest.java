package com.github.ivan.kopylove.sandbox.java.jcl.java.util.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Purpose of this example: to show that it is not safe to get stream from null object
 *
 * 
 */
public class StreamsNullSafetyTest
{
    @Test
    public void run()
    {
        assertThrows(NullPointerException.class, () -> {

            List<String> myList = null;
            myList.stream()
                  .forEach(System.out::println);
        });
    }
}
