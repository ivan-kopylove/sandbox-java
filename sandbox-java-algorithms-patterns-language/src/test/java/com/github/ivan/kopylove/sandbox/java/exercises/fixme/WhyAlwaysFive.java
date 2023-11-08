package com.github.ivan.kopylove.sandbox.java.exercises.fixme;

import org.junit.jupiter.api.Test;

/**
 * facets:
 * - koan
 */
public class WhyAlwaysFive
{
    int i = 0;

    @Test
    public void recurred()
    {
        i++;
        if (i < 5)
        {
            recurred();
        }
        System.out.println(i);
    }
}
