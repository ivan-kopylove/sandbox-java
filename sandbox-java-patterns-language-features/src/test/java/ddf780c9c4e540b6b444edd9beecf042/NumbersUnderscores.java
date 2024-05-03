package com.github.ivan.kopylove.challenges.ddf780c9c4e540b6b444edd9beecf042;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersUnderscores
{

    @Test
    void scientificNotation()
    {

        //        int x = 10e1; //uncompilable
        //        float x = 10e1; //uncompilable

        double a1 = 10e1;
        double a2 = 10e01f;

        double a3 = 15e1f;
        double a4 = 15.5e1f;

        double a5 = 15.5e-0f;
        double a6 = 15.5e-1f;

        assertEquals(100.0, a1, 0);
        assertEquals(100.0, a2, 0);
        assertEquals(150.0, a3, 0);
        assertEquals(155.0, a4, 0);
        assertEquals(15.5, a5, 0);
        assertEquals(1.55, a6, 0.0000001);
    }

    @Test
    void valid()
    {
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        int bin = 0b1111_0000_1100_1100;

        int oct1 = 07;
        int oct2 = 010;
        int hex1 = 0xA;
        int hex2 = 0xDEAF_ACED;
        int hex3 = 0xA___________A;
        float f = 9898_7878.333_333f;

        assertEquals(0b00100101, nybbles);
        assertEquals(37, nybbles);

        assertEquals(-764832622, bytes);
        assertEquals(0b11010010011010011001010010010010, bytes);

        assertEquals(0b1111000011001100, bin);
        assertEquals(61644, bin);


        assertEquals(07, oct1);
        assertEquals(7, oct1);
        assertEquals(010, oct2);
        assertEquals(8, oct2);

        assertEquals(0xA, hex1);
        assertEquals(10, hex1);
        assertEquals(0xDEAFACED, hex2);
        assertEquals(-558912275, hex2);
        assertEquals(170, hex3);
        assertEquals(170, hex3);

        assertEquals(98987878.333333f, f, 0);
    }

    @Test
    void invalid()
    {
        //      int value = 1,000,000;
        //        float pi1 = 3_.1415F;      // Invalid; cannot put underscores adjacent to a decimal point
        //        float pi2 = 3._1415F;      // Invalid; cannot put underscores adjacent to a decimal point
        //        long socialSecurityNumber1 = 999_99_9999_L;         // Invalid; cannot put underscores prior to an L suffix
        //        int x3 = 52_;              // Invalid; cannot put underscores at the end of a literal
        //        int x5 = 0_x52;            // Invalid; cannot put underscores in the 0x radix prefix
        //        int x6 = 0x_52;            // Invalid; cannot put underscores at the beginning of a number
        //        int x8 = 0x52_;            // Invalid; cannot put underscores at the end of a number
        //        int x11 = 052_;            // Invalid; cannot put underscores at the end of a number
    }
}
