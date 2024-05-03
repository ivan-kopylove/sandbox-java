package com.github.ivan.kopylove.challenges.dd18e4cce4164a7281bd74d046a2f037;

import org.junit.jupiter.api.Test;

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
        String result = com.github.ivan.kopylove.challenges.dd18e4cce4164a7281bd74d046a2f037.MyEnumSingleton.INSTANCE.utilMethod();
        assertEquals(com.github.ivan.kopylove.challenges.dd18e4cce4164a7281bd74d046a2f037.MyEnumSingleton.RETURN_RESULT, result);
    }
}