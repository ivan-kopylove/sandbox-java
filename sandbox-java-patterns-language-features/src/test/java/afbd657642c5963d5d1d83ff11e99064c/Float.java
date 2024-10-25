package afbd657642c5963d5d1d83ff11e99064c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(1, f2, 0);
    }

    @Test
    void run3()
    {
        float hex1 = 0xA;
        float hex2 = 0x0A;
        float hex3 = 0x00000A;
        float hex4 = 0x00_000_A;

        assertEquals(hex1, hex2, 0);
        assertEquals(hex1, hex3, 0);
        assertEquals(hex1, hex4, 0);
    }

    @Test
    void run4()
    {
        float f1 = -1;

        assertEquals(-1, f1, 0);
    }

    @Test
    void run5()
    {
        float f1 = java.lang.Float.MAX_VALUE;

        System.out.println(f1);
    }
}
