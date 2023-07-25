package com.github.ivan.kopylove.sandbox.java.jcl.java.util.collections;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class CollectionsEmptyList
{
    @Test(expected = UnsupportedOperationException.class)
    public void run()
    {
        List<Object> objects = Collections.emptyList();
        objects.add("dsa");
    }
}
