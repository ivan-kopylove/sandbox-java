package com.github.ivan.kopylove.sandbox.java.jcl.java.util.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NewArrayListExampleTest
{

    @Test
    public void test()
    {
        List<MyObj> list1 = new ArrayList<>();
        list1.add(new MyObj());
        list1.add(new MyObj());
        list1.add(null);

        List<MyObj> list2 = new ArrayList<>(list1);

        Assertions.assertSame(list1.get(0), list2.get(0));
        Assertions.assertSame(list1.get(1), list2.get(1));
    }
}
