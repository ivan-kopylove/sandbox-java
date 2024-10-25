package a98b24895fa11c8513a37be3f0c10d740;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * java.util.* playground
 */
class ArraysAsListFixedSizeExampleTest
{
    @Test
    void Arrays_asList_immutable()
    {
        assertThrows(UnsupportedOperationException.class, () -> {


            List<String> immutableList = Arrays.asList("1", "2");
            immutableList.add("3");
        });
    }

    @Test
    void Collections_singletonList_immutability()
    {
        assertThrows(UnsupportedOperationException.class, () -> {
            List<String> immutableList = Collections.singletonList("a");
            immutableList.add("b");
        });
    }

    @Test
    void Arrays_asList_make_mutable()
    {
        List<String> immutableList = Arrays.asList("1", "2");
        List<String> mutableList = new ArrayList<>(immutableList);
        mutableList.add("3");
        assertEquals("3", mutableList.get(2));
    }
}
