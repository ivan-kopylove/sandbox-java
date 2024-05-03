package com.github.ivan.kopylove.challenges.c65a9ff557614d7ea64fef80dda9f68a;

import org.junit.jupiter.api.Test;

/**
 * facets:
 * - koan
 * - exercise
 */
class WhyAlwaysFiveKoanTest
{
    int i = 0;

    @Test
    void recurred()
    {
        i++;
        if (i < 5)
        {
            recurred();
        }
        System.out.println(i);
    }
}
