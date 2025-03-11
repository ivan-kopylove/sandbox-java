package heap.afbd657642c5963d5d1d83ff11e99064c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplicitNarrowingTest
{

    @Test
    void run1()
    {
        int i1 = 100;
        byte b1 = (byte) i1;
        System.out.println(b1);
        assertEquals(100, b1);
    }

    @Test
    void run2()
    {
        int i1 = 127;
        byte b1 = (byte) i1;
        assertEquals(127, b1);
    }

    @Test
    void run3()
    {
        int i1 = 128;
        byte b1 = (byte) i1;
        assertEquals(-128, b1);
    }

    @Test
    void run4()
    {
        int i1 = 255;
        byte b1 = (byte) i1;
        assertEquals(-1, b1);
    }
}
