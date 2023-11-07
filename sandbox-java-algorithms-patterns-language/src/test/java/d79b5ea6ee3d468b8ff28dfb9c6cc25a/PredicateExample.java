package d79b5ea6ee3d468b8ff28dfb9c6cc25a;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample
{
    @Test
    public void run()
    {
        Stream<String> myStream = Stream.of("a", "b", "c");

        List<String> result = myStream.filter(PredicateCreator.build(a -> a.equalsIgnoreCase("a")))
                                      .collect(Collectors.toList());

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("a", result.get(0));
    }
}
