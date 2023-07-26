package com.github.ivan.kopylove.sandbox.java.jcl.java.util.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListToStringTest
{
    @Test
    public void run()
    {
        List<String> list = new ArrayList<>();
        list.add("dsa1");
        list.add("dsa2");
        list.add("dsa3");
        list.add("dsa4");
        String x = list.toString();
        assertEquals("[dsa1, dsa2, dsa3, dsa4]", x);
    }
}
