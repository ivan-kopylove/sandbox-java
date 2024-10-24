package d7e984e7d7e342f1868f23c7ef3c238f;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CastingTests
{

    /**
     * Automatic type conversion. No explicit cast required.
     */
    @Test
    void wideningCasting()
    {
        byte b = 40;
        // No casting needed for below conversion, because automatic widening is performed
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("byte value : " + b);
        System.out.println("short value : " + s);
        System.out.println("int value : " + i);
        System.out.println("long value : " + l);
        System.out.println("float value : " + f);
        System.out.println("double value : " + d);

        assertEquals(40, b);
        assertEquals(40, s);
        assertEquals(40, i);
        assertEquals(40, l);
        assertEquals(40L, f, 0);
        assertEquals(40, d, 0);
    }

    /**
     * Explicit cast required.
     */
    @Test
    void narrowingCasting()
    {
        double d = 30.0;
        // Explicit casting is needed for below conversion
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        System.out.println("double value : " + d);
        System.out.println("float value : " + f);
        System.out.println("long value : " + l);
        System.out.println("int value : " + i);
        System.out.println("short value : " + s);
        System.out.println("byte value : " + b);

        assertEquals(30.0, d, 0);
        assertEquals(30.0, f, 0);
        assertEquals(30, l);
        assertEquals(30, i);
        assertEquals(30, s);
        assertEquals(30, b);
    }

    /**
     * Implicit narrowing is supported among byte, char, short, and int when literals are used.
     */
    @Test
    void narrowingCastingImplicit()
    {
        byte b1 = 127; //implicit cast from integer to byte.
        //        char c1 = -1;
        //        char c2 = 65536;
        char c2 = 65535;
        assertEquals(127, b1);
        assertEquals(65535, c2);
    }

    @Test
    void narrowingCastingImplicit1()
    {
        int i1 = 5000;
        //        byte b1 = i1;//d'oh, only for literals
    }

    /**
     * Implicit narrowing is permitted only among byte, char, short, and int.
     */
    @Test
    void narrowingCastingFloatingPointNumbers()
    {
        //        float f1 = 1.0; //attempt to cast double to float
        float f2 = 1.0f; //legal notation, works fine
    }

    /**
     * Explicit cast is required to case byte primitive to Integer wrapper.
     */
    @Test
    void noAutobox()
    {
        //        byte b = 1;
        //        Integer i = b; //no automatic widening to int and then auto box.

        byte q = 1;
        int i = q; // automatic widening
    }
}
