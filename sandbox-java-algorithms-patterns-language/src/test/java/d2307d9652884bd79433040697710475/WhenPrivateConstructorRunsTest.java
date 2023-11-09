package d2307d9652884bd79433040697710475;

import org.junit.jupiter.api.Test;

import static d2307d9652884bd79433040697710475.PrivateConstructorClass.privateConstructorClass;
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
