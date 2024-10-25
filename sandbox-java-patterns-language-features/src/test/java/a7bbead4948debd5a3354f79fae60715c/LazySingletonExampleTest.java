package a7bbead4948debd5a3354f79fae60715c;

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
