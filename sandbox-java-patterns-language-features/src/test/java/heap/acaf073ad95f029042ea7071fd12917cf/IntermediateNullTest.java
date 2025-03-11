package heap.acaf073ad95f029042ea7071fd12917cf;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * java streams playground
 */
class IntermediateNullTest
{

    @Test
    void a()
    {
        List<Object> mapped = Stream.of("1", "2")
                                    .map(s -> null)
                                    .peek(System.out::println)
                                    .collect(Collectors.toList());

        assertNull(mapped.get(0));
        assertNull(mapped.get(1));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void b()
    {
        List<Object> mapped = Stream.of("1", "2")
                                    .map(s -> null)
                                    .filter(Objects::nonNull) //this helps
                                    .peek(System.out::println)
                                    .collect(Collectors.toList());

        assertEquals(0, mapped.size());
    }
}
