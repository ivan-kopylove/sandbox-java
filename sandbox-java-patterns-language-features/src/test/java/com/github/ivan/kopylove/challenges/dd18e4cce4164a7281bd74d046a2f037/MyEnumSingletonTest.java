package com.github.ivan.kopylove.challenges.dd18e4cce4164a7281bd74d046a2f037;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * facets:
 * - patterns
 * - singleton
 */
class MyEnumSingletonTest
{
    @Test
    void run()
    {
        String result = MyEnumSingleton.INSTANCE.utilMethod();
        assertEquals(MyEnumSingleton.RETURN_RESULT, result);
    }
}