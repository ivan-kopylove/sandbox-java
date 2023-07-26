package com.github.ivan.kopylove.sandbox.java.mechanics.primitives;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Double
{
    @Test
    public void run1()
    {
        double d1 = 1.0;
        double d2 = 43e1;//scientific notation
        double d3 = 43e2;//scientific notation

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        Assertions.assertEquals(1.0, d1, 0);
        Assertions.assertEquals(430, d2, 0);
        Assertions.assertEquals(4300, d3, 0);
    }

    @Test
    public void implicit_narrowing()
    {
        float f1 = 1.0f;
        double d1 = f1;

        Assertions.assertEquals(f1, d1, 0);
    }
}
