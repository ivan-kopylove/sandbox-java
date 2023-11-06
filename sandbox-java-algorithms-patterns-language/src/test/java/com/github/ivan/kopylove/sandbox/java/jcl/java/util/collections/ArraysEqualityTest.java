package com.github.ivan.kopylove.sandbox.java.jcl.java.util.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArraysEqualityTest
{
    @Test
    public void run()
    {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");

        Assertions.assertEquals(list, list2); //compared in AbstractList.equals() one by one
    }
}
