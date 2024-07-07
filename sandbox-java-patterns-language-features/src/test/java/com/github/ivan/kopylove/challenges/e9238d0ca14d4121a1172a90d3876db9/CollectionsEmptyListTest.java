package com.github.ivan.kopylove.challenges.e9238d0ca14d4121a1172a90d3876db9;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CollectionsEmptyListTest
{
    @Test
    void run()
    {
        assertThrows(UnsupportedOperationException.class, () -> {
            List<Object> objects = Collections.emptyList();
            objects.add("dsa");
        });
    }
}
