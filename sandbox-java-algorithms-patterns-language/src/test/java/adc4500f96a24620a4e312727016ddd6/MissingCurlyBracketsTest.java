package com.github.ivan.kopylove.challenges.adc4500f96a24620a4e312727016ddd6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingCurlyBracketsTest
{

    @Test
    void run()
    {
        int a = 0;
        int b = 0;
        int c = 0;


        if (false)
        {
            a = 1;
        }
        b = 1;


        if (false)
        {
            c = 1;
        }

        assertEquals(0, a);
        assertEquals(1, b);
        assertEquals(0, c);
    }
}
