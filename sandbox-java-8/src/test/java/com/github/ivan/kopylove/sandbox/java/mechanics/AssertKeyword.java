package com.github.ivan.kopylove.sandbox.java.mechanics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertKeyword
{
    @Test
    public void run()
    {
        assertThrows(AssertionError.class, () -> {
            assert 2 == 1;
        });
    }
}
