package com.github.ivan.kopylove.challenges.df84417104c54c4fb8a57f9baff73d72;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * facets:
 * - patterns
 * - singleton
 */
class LazySingletonExampleTest
{
    @Test
    void lazySingleton()
    {
        LazySingleton instance = LazySingleton.getInstance();
        assertNotNull(instance);
    }
}
