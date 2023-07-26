package com.github.ivan.kopylove.sandbox.java.jcl.java.util.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OutOfBoundExample
{
    @Test
    public void run()
    {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            List<String> l = new ArrayList<>();
            l.get(-1);
        });
    }

    @Test
    public void run2()
    {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            List<String> l = new ArrayList<>();
            l.get(500);
        });
    }
}
