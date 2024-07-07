package com.github.ivan.kopylove.challenges.d19118ab94334147a5829b3422c505d5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
class OutOfMemoryErrorTest
{
    @Test
    void run()
    {
        assertThrows(OutOfMemoryError.class, () -> {
            List<String> list = new ArrayList<>();
            for (long i = 0; i < 1_000_000_000; i++)
            {
                list.add(String.valueOf(i));
            }
        });
    }
}
