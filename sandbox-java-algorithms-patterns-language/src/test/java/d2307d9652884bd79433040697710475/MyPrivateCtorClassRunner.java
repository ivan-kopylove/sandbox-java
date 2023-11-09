package d2307d9652884bd79433040697710475;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyPrivateCtorClassRunner
{
    @Test
    void run()
    {
        String value = MyPrivateCtorClass.getValue();
        Assertions.assertEquals("static initializer updated value", value);
    }
}
