package heap.ac2ddbd72c1106e83b46fd0152e2c7db4;

import org.junit.jupiter.api.Test;

import static heap.ac2ddbd72c1106e83b46fd0152e2c7db4.PrivateConstructorClass.privateConstructorClass;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WhenPrivateConstructorRunsTest
{
    @Test
    void run_me_in_debug_mode()
    {
        String value = PrivateConstructorClass.getValue();
        assertEquals("put breakpoint here", value);
    }

    @Test
    void run_me_in_debug_mode2()
    {
        String input = "my custom value";

        PrivateConstructorClass myClass = privateConstructorClass(input);
        assertEquals(input, myClass.getMyString());
    }
}
