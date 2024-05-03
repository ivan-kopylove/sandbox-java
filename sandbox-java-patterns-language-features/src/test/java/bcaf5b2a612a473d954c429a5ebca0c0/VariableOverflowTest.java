package com.github.ivan.kopylove.challenges.bcaf5b2a612a473d954c429a5ebca0c0;

import org.junit.jupiter.api.Test;

/**
 * variable overflow demo
 */
class VariableOverflowTest
{
    @Test
    void run()
    {
        int x = 10;
        do
        {
            x--;
            if (x > 0)
            {
                System.out.println("x>0: " + x);
            }
        } while (x < 10);
        System.out.println(x);
    }
}
