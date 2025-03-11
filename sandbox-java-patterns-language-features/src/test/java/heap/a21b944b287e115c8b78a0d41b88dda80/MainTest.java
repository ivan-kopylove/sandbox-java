package heap.a21b944b287e115c8b78a0d41b88dda80;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MainTest
{
    @Test
    void main()
    {
        assertNotEquals(null, new Foo());
        assertNotEquals(null, new Date());
    }
}
