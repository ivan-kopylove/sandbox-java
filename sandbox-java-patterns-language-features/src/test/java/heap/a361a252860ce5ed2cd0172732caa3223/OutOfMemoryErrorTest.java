package heap.a361a252860ce5ed2cd0172732caa3223;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class OutOfMemoryErrorTest
{
    @Test
    void run()
    {
        assertThrows(OutOfMemoryError.class, () -> {
            List<String> list = new ArrayList<>();
            for (long i = 0; i < 1_000_000_000; i++)
            {
                list.add(String.valueOf(i));
            }
        });
    }
}
