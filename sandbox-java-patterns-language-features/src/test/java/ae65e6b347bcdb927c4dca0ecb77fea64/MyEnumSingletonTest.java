package ae65e6b347bcdb927c4dca0ecb77fea64;

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