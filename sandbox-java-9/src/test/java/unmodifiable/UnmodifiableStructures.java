package unmodifiable;

import org.junit.jupiter.api.Test;

import java.util.List;

class UnmodifiableStructures
{
    @Test
    void run()
    {
        List<String> a = List.of("a");
        a.add("b");
    }
}
