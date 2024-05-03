package com.github.ivan.kopylove.challenges.f149ea6c47d04063a3b7cc2f6a0fb03b;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Purpose of this example: to show that it is not safe to get stream from null object
 */
class StreamsNullSafetyTest
{
    @Test
    void run()
    {
        assertThrows(NullPointerException.class, () -> {

            List<String> myList = null;
            myList.stream()
                  .forEach(System.out::println);
        });
    }
}
