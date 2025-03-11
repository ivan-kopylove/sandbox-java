package heap.acaf073ad95f029042ea7071fd12917cf;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * java streams playground
 */
class OrderOfOperationsMattersTest
{

    public static void orderOfOperationsMatters()
    {
        List<String> result1 = Stream.of("1", "22", "333")
                                     .map(s -> s + "-postfix")
                                     .filter(s -> s.length() > 1)
                                     .collect(Collectors.toList());

        List<String> result2 = Stream.of("1", "22", "333")
                                     .filter(s -> s.length() > 1)
                                     .map(s -> s + "-postfix")
                                     .collect(Collectors.toList());

        assertEquals(3, result1.size());
        assertEquals(2, result2.size());
    }

    @Test
    void main()
    {
        orderOfOperationsMatters();
    }
}
