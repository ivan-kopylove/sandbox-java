package d7e984e7d7e342f1868f23c7ef3c238f;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Float
{

    @Test
    void mistakes()
    {
        //        float f1 = 1.0; //not compilable, because it is a double
        //        float f2 = 43e1; //not compilable, because it is a double
    }

    @Test
    void run1()
    {
        float f2 = 1.0f;
        Assertions.assertEquals(1, f2, 0);
    }

    @Test
    void run3()
    {
        float hex1 = 0xA;
        float hex2 = 0x0A;
        float hex3 = 0x00000A;
        float hex4 = 0x00_000_A;

        Assertions.assertEquals(hex1, hex2, 0);
        Assertions.assertEquals(hex1, hex3, 0);
        Assertions.assertEquals(hex1, hex4, 0);
    }

    @Test
    void run4()
    {
        float f1 = -1;

        Assertions.assertEquals(-1, f1, 0);
    }

    @Test
    void run5()
    {
        float f1 = java.lang.Float.MAX_VALUE;

        System.out.println(f1);
    }
}
