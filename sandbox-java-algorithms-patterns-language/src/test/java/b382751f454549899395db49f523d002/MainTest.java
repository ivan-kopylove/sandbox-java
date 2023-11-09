package b382751f454549899395db49f523d002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class MainTest
{
    @Test
    void main()
    {
        Assertions.assertNotEquals(null, new Foo());
        Assertions.assertNotEquals(null, new Date());
    }
}
