package com.github.ivan.kopylove.challenges.e9238d0ca14d4121a1172a90d3876db9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

class NewArrayListExampleTest
{

    @Test
    void test()
    {
        List<MyObj> list1 = new ArrayList<>();
        list1.add(new MyObj());
        list1.add(new MyObj());
        list1.add(null);

        List<MyObj> list2 = new ArrayList<>(list1);

        assertSame(list1.get(0), list2.get(0));
        assertSame(list1.get(1), list2.get(1));
    }
}
