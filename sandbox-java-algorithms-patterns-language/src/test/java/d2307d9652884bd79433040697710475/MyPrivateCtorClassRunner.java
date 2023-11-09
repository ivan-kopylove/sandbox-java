package d2307d9652884bd79433040697710475;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyPrivateCtorClassRunner
{
    @Test
    void run()
    {
        String value = MyPrivateCtorClass.getValue();
        assertEquals("static initializer updated value", value);
    }
}
