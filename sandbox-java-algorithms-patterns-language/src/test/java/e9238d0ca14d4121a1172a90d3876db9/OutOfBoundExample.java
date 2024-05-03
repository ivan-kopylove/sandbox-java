package com.github.ivan.kopylove.challenges.e9238d0ca14d4121a1172a90d3876db9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class OutOfBoundExample
{
    @Test
    void run()
    {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            List<String> l = new ArrayList<>();
            l.get(-1);
        });
    }

    @Test
    void run2()
    {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            List<String> l = new ArrayList<>();
            l.get(500);
        });
    }
}
