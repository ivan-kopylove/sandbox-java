package com.github.ivan.kopylove.sandbox.java.jcl.java.util.collections;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CollectionsEmptyList
{
    @Test
    public void run()
    {
        assertThrows(UnsupportedOperationException.class, () -> {
            List<Object> objects = Collections.emptyList();
            objects.add("dsa");
        });
    }
}
