package unmodifiable;

import org.junit.jupiter.api.Test;

import java.util.List;

public class UnmodifiableStructures
{
    @Test
    public void run()
    {
        List<String> a = List.of("a");
        a.add("b");
    }
}
