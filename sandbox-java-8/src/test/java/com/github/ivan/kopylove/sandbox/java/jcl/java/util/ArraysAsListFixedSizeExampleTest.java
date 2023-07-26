package com.github.ivan.kopylove.sandbox.java.jcl.java.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArraysAsListFixedSizeExampleTest
{
    @Test
    public void Arrays_asList_immutable()
    {
        assertThrows(UnsupportedOperationException.class, () -> {


            List<String> immutableList = Arrays.asList("1", "2");
            immutableList.add("3");
        });
    }

    @Test
    public void Collections_singletonList_immutability()
    {
        assertThrows(UnsupportedOperationException.class, () -> {
            List<String> immutableList = Collections.singletonList("a");
            immutableList.add("b");
        });
    }

    @Test
    public void Arrays_asList_make_mutable()
    {
        List<String> immutableList = Arrays.asList("1", "2");
        List<String> mutableList = new ArrayList<>(immutableList);
        mutableList.add("3");
        Assertions.assertEquals("3", mutableList.get(2));
    }
}
