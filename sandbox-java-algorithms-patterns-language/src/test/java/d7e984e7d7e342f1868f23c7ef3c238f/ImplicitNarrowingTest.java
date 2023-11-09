package d7e984e7d7e342f1868f23c7ef3c238f;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplicitNarrowingTest
{

    @Test
    void run1()
    {
        int i1 = 100;
        byte b1 = (byte) i1;
        System.out.println(b1);
        Assertions.assertEquals(100, b1);
    }

    @Test
    void run2()
    {
        int i1 = 127;
        byte b1 = (byte) i1;
        Assertions.assertEquals(127, b1);
    }

    @Test
    void run3()
    {
        int i1 = 128;
        byte b1 = (byte) i1;
        Assertions.assertEquals(-128, b1);
    }

    @Test
    void run4()
    {
        int i1 = 255;
        byte b1 = (byte) i1;
        Assertions.assertEquals(-1, b1);
    }
}
