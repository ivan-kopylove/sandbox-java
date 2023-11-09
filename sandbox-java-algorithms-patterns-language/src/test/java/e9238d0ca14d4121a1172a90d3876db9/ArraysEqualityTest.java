package e9238d0ca14d4121a1172a90d3876db9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ArraysEqualityTest
{
    @Test
    void run()
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
