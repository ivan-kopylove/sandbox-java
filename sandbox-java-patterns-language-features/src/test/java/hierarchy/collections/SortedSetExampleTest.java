package hierarchy.collections;

import org.junit.jupiter.api.Test;

import java.util.SortedSet;
import java.util.TreeSet;

class SortedSetExampleTest
{
    @Test
    void run()
    {
        SortedSet<String> mySet = new TreeSet<>();
        mySet.add("a");
        mySet.add("1");
    }
}
