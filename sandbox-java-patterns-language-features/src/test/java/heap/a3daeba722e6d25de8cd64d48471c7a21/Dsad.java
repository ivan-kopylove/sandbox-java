package heap.a3daeba722e6d25de8cd64d48471c7a21;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;

class Dsad
{
    @Test
    void streamWithoutTerminalOperationIsNotExecuted()
    {
        AtomicBoolean result = new AtomicBoolean(false);
        Stream.of("a", "b")
              .map(Function.identity())
              .peek(s -> {
                  System.out.println(s);
                  result.set(true);
              });
        assertFalse(result.get());
    }
}
