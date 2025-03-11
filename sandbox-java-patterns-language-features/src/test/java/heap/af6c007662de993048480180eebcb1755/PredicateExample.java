package heap.af6c007662de993048480180eebcb1755;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PredicateExample
{
    @Test
    void run()
    {
        Stream<String> myStream = Stream.of("a", "b", "c");

        List<String> result = myStream.filter(PredicateCreator.build(a -> a.equalsIgnoreCase("a")))
                                      .collect(Collectors.toList());

        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }
}
