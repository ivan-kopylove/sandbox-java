package com.github.ivan.kopylove.sandbox.java.mechanics.exceptions.errors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OutOfMemoryErrorExample
{
    @Test
    public void ucommentMe()
    {

        assertThrows(OutOfMemoryError.class, () -> {
            //        List<String> list = new ArrayList<>();
            //        for (long i = 0; i < 1_000_000_000; i++)
            //        {
            //            list.add(String.valueOf(i));
            //        }
        });
    }
}
