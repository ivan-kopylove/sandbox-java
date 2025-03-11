package heap.acaf073ad95f029042ea7071fd12917cf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java streams playground
 */
class GroupingByBasicExampleTest
{
    @Test
    void run()
    {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        Map<Boolean, List<Integer>> collect = ints.stream()
                                                  .collect(Collectors.groupingBy(integer -> integer > 1));
        assertEquals(3,
                     (int) collect.get(true)
                                  .get(1));
    }
}
