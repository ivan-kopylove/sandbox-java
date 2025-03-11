package hierarchy.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
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
